package cryptoTools;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import utils.DummyConfigOptions;

public class EncryptionAPI {
	private EncryptionBackend _backend;

	public EncryptionAPI() {
		String pw;
		if (!new File(DummyConfigOptions.PRIVATE_KEY_PATH)
				.exists()
				|| !new File(DummyConfigOptions.PUBLIC_KEY_PATH)
						.exists()) {
			KeyGen keygen = new KeyGen();
			//retrieve the passphrase from the text input before destroying 
			//the dialog
			//TODO: save a hashed version of the give password in a file so we can compare it 
			//with the PasswordPrompt input (jBCrypt)
			pw = keygen.getPassphrase(); 
			while(!new File(DummyConfigOptions.PUBLIC_KEY_PATH).exists()) {
				//waiting for keypair creation
			}
			//keygen.kill();
		} else {
			PasswordPrompt prompt = new PasswordPrompt();
			pw = prompt.reveal();
		}

		try{
			_backend = new EncryptionBackend(pw);
		} catch(NoSuchAlgorithmException | NoSuchPaddingException e) {
			new utils.ErrorDialog(e);
			e.printStackTrace();
			System.exit(1);
		}
		//ready pw variable for garbage collection to have the plain text 
		//password cleared from RAM as soon as possible
		pw = null; 
	}
	
	public void encryptFile(File in, File out) {
		try{
			_backend.encrypt(in, out);
		} catch(IOException | InvalidKeyException e) {
			new utils.ErrorDialog(e);
			e.printStackTrace();
		}
	}
	
	public void decryptFile(File in, File out) {
		try{
			_backend.decrypt(in, out);
		} catch(IOException | InvalidKeyException e) {
			new utils.ErrorDialog(e);
			e.printStackTrace();
		}
	}
}