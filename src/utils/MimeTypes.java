package utils;

import java.util.HashMap;

public class MimeTypes extends HashMap<String, String> {

	private static final long serialVersionUID = 4120330893892701165L;

	public MimeTypes() {
		super();
		// fill with all the mime-types (source:
		// http://www.sitepoint.com/web-foundations/mime-types-complete-list/ )
		this.put(".3dm", "x-world/x-3dmf");
		this.put(".3dmf", "x-world/x-3dmf");
		this.put(".a", "application/octet-stream");
		this.put(".aab", "application/x-authorware-bin");
		this.put(".aam", "application/x-authorware-map");
		this.put(".aas", "application/x-authorware-seg");
		this.put(".abc", "text/vnd.abc");
		this.put(".acgi", "text/html");
		this.put(".afl", "video/animaflex");
		this.put(".ai", "application/postscript");
		this.put(".aif", "audio/aiff");
		this.put(".aif", "audio/x-aiff");
		this.put(".aifc", "audio/aiff");
		this.put(".aifc", "audio/x-aiff");
		this.put(".aiff", "audio/aiff");
		this.put(".aiff", "audio/x-aiff");
		this.put(".aim", "application/x-aim");
		this.put(".aip", "text/x-audiosoft-intra");
		this.put(".ani", "application/x-navi-animation");
		this.put(".aos",
				"application/x-nokia-9000-communicator-add-on-software");
		this.put(".aps", "application/mime");
		this.put(".arc", "application/octet-stream");
		this.put(".arj", "application/arj");
		this.put(".arj", "application/octet-stream");
		this.put(".art", "image/x-jg");
		this.put(".asf", "video/x-ms-asf");
		this.put(".asm", "text/x-asm");
		this.put(".asp", "text/asp");
		this.put(".asx", "application/x-mplayer2");
		this.put(".asx", "video/x-ms-asf");
		this.put(".asx", "video/x-ms-asf-plugin");
		this.put(".au", "audio/basic");
		this.put(".au", "audio/x-au");
		this.put(".avi", "application/x-troff-msvideo");
		this.put(".avi", "video/avi");
		this.put(".avi", "video/msvideo");
		this.put(".avi", "video/x-msvideo");
		this.put(".avs", "video/avs-video");
		this.put(".bcpio", "application/x-bcpio");
		this.put(".bin", "application/mac-binary");
		this.put(".bin", "application/macbinary");
		this.put(".bin", "application/octet-stream");
		this.put(".bin", "application/x-binary");
		this.put(".bin", "application/x-macbinary");
		this.put(".bm", "image/bmp");
		this.put(".bmp", "image/bmp");
		this.put(".bmp", "image/x-windows-bmp");
		this.put(".boo", "application/book");
		this.put(".book", "application/book");
		this.put(".boz", "application/x-bzip2");
		this.put(".bsh", "application/x-bsh");
		this.put(".bz", "application/x-bzip");
		this.put(".bz2", "application/x-bzip2");
		this.put(".c", "text/plain");
		this.put(".c", "text/x-c");
		this.put(".c++", "text/plain");
		this.put(".cat", "application/vnd.ms-pki.seccat");
		this.put(".cc", "text/plain");
		this.put(".cc", "text/x-c");
		this.put(".ccad", "application/clariscad");
		this.put(".cco", "application/x-cocoa");
		this.put(".cdf", "application/cdf");
		this.put(".cdf", "application/x-cdf");
		this.put(".cdf", "application/x-netcdf");
		this.put(".cer", "application/pkix-cert");
		this.put(".cer", "application/x-x509-ca-cert");
		this.put(".cha", "application/x-chat");
		this.put(".chat", "application/x-chat");
		this.put(".class", "application/java");
		this.put(".class", "application/java-byte-code");
		this.put(".class", "application/x-java-class");
		this.put(".com", "application/octet-stream");
		this.put(".com", "text/plain");
		this.put(".conf", "text/plain");
		this.put(".cpio", "application/x-cpio");
		this.put(".cpp", "text/x-c");
		this.put(".cpt", "application/mac-compactpro");
		this.put(".cpt", "application/x-compactpro");
		this.put(".cpt", "application/x-cpt");
		this.put(".crl", "application/pkcs-crl");
		this.put(".crl", "application/pkix-crl");
		this.put(".crt", "application/pkix-cert");
		this.put(".crt", "application/x-x509-ca-cert");
		this.put(".crt", "application/x-x509-user-cert");
		this.put(".csh", "application/x-csh");
		this.put(".csh", "text/x-script.csh");
		this.put(".css", "application/x-pointplus");
		this.put(".css", "text/css");
		this.put(".cxx", "text/plain");
		this.put(".dcr", "application/x-director");
		this.put(".deepv", "application/x-deepv");
		this.put(".def", "text/plain");
		this.put(".der", "application/x-x509-ca-cert");
		this.put(".dif", "video/x-dv");
		this.put(".dir", "application/x-director");
		this.put(".dl", "video/dl");
		this.put(".dl", "video/x-dl");
		this.put(".doc", "application/msword");
		this.put(".dot", "application/msword");
		this.put(".dp", "application/commonground");
		this.put(".drw", "application/drafting");
		this.put(".dump", "application/octet-stream");
		this.put(".dv", "video/x-dv");
		this.put(".dvi", "application/x-dvi");
		this.put(".dwf", "drawing/x-dwf (old)");
		this.put(".dwf", "model/vnd.dwf");
		this.put(".dwg", "application/acad");
		this.put(".dwg", "image/vnd.dwg");
		this.put(".dwg", "image/x-dwg");
		this.put(".dxf", "application/dxf");
		this.put(".dxf", "image/vnd.dwg");
		this.put(".dxf", "image/x-dwg");
		this.put(".dxr", "application/x-director");
		this.put(".el", "text/x-script.elisp");
		this.put(".elc", "application/x-bytecode.elisp (compiled elisp)");
		this.put(".elc", "application/x-elc");
		this.put(".env", "application/x-envoy");
		this.put(".eps", "application/postscript");
		this.put(".es", "application/x-esrehber");
		this.put(".etx", "text/x-setext");
		this.put(".evy", "application/envoy");
		this.put(".evy", "application/x-envoy");
		this.put(".exe", "application/octet-stream");
		this.put(".f", "text/plain");
		this.put(".f", "text/x-fortran");
		this.put(".f77", "text/x-fortran");
		this.put(".f90", "text/plain");
		this.put(".f90", "text/x-fortran");
		this.put(".fdf", "application/vnd.fdf");
		this.put(".fif", "application/fractals");
		this.put(".fif", "image/fif");
		this.put(".fli", "video/fli");
		this.put(".fli", "video/x-fli");
		this.put(".flo", "image/florian");
		this.put(".flx", "text/vnd.fmi.flexstor");
		this.put(".fmf", "video/x-atomic3d-feature");
		this.put(".for", "text/plain");
		this.put(".for", "text/x-fortran");
		this.put(".fpx", "image/vnd.fpx");
		this.put(".fpx", "image/vnd.net-fpx");
		this.put(".frl", "application/freeloader");
		this.put(".funk", "audio/make");
		this.put(".g", "text/plain");
		this.put(".g3", "image/g3fax");
		this.put(".gif", "image/gif");
		this.put(".gl", "video/gl");
		this.put(".gl", "video/x-gl");
		this.put(".gsd", "audio/x-gsm");
		this.put(".gsm", "audio/x-gsm");
		this.put(".gsp", "application/x-gsp");
		this.put(".gss", "application/x-gss");
		this.put(".gtar", "application/x-gtar");
		this.put(".gz", "application/x-compressed");
		this.put(".gz", "application/x-gzip");
		this.put(".gzip", "application/x-gzip");
		this.put(".gzip", "multipart/x-gzip");
		this.put(".h", "text/plain");
		this.put(".h", "text/x-h");
		this.put(".hdf", "application/x-hdf");
		this.put(".help", "application/x-helpfile");
		this.put(".hgl", "application/vnd.hp-hpgl");
		this.put(".hh", "text/plain");
		this.put(".hh", "text/x-h");
		this.put(".hlb", "text/x-script");
		this.put(".hlp", "application/hlp");
		this.put(".hlp", "application/x-helpfile");
		this.put(".hlp", "application/x-winhelp");
		this.put(".hpg", "application/vnd.hp-hpgl");
		this.put(".hpgl", "application/vnd.hp-hpgl");
		this.put(".hqx", "application/binhex");
		this.put(".hqx", "application/binhex4");
		this.put(".hqx", "application/mac-binhex");
		this.put(".hqx", "application/mac-binhex40");
		this.put(".hqx", "application/x-binhex40");
		this.put(".hqx", "application/x-mac-binhex40");
		this.put(".hta", "application/hta");
		this.put(".htc", "text/x-component");
		this.put(".htm", "text/html");
		this.put(".html", "text/html");
		this.put(".htmls", "text/html");
		this.put(".htt", "text/webviewhtml");
		this.put(".htx", "text/html");
		this.put(".ice", "x-conference/x-cooltalk");
		this.put(".ico", "image/x-icon");
		this.put(".idc", "text/plain");
		this.put(".ief", "image/ief");
		this.put(".iefs", "image/ief");
		this.put(".iges", "application/iges");
		this.put(".iges", "model/iges");
		this.put(".igs", "application/iges");
		this.put(".igs", "model/iges");
		this.put(".ima", "application/x-ima");
		this.put(".imap", "application/x-httpd-imap");
		this.put(".inf", "application/inf");
		this.put(".ins", "application/x-internett-signup");
		this.put(".ip", "application/x-ip2");
		this.put(".isu", "video/x-isvideo");
		this.put(".it", "audio/it");
		this.put(".iv", "application/x-inventor");
		this.put(".ivr", "i-world/i-vrml");
		this.put(".ivy", "application/x-livescreen");
		this.put(".jam", "audio/x-jam");
		this.put(".jav", "text/plain");
		this.put(".jav", "text/x-java-source");
		this.put(".java", "text/plain");
		this.put(".java", "text/x-java-source");
		this.put(".jcm", "application/x-java-commerce");
		this.put(".jfif", "image/jpeg");
		this.put(".jfif", "image/pjpeg");
		this.put(".jfif-tbnl", "image/jpeg");
		this.put(".jpe", "image/jpeg");
		this.put(".jpe", "image/pjpeg");
		this.put(".jpeg", "image/jpeg");
		this.put(".jpeg", "image/pjpeg");
		this.put(".jpg", "image/jpeg");
		this.put(".jpg", "image/pjpeg");
		this.put(".jps", "image/x-jps");
		this.put(".js", "application/x-javascript");
		this.put(".js", "application/javascript");
		this.put(".js", "application/ecmascript");
		this.put(".js", "text/javascript");
		this.put(".js", "text/ecmascript");
		this.put(".jut", "image/jutvision");
		this.put(".kar", "audio/midi");
		this.put(".kar", "music/x-karaoke");
		this.put(".ksh", "application/x-ksh");
		this.put(".ksh", "text/x-script.ksh");
		this.put(".la", "audio/nspaudio");
		this.put(".la", "audio/x-nspaudio");
		this.put(".lam", "audio/x-liveaudio");
		this.put(".latex", "application/x-latex");
		this.put(".lha", "application/lha");
		this.put(".lha", "application/octet-stream");
		this.put(".lha", "application/x-lha");
		this.put(".lhx", "application/octet-stream");
		this.put(".list", "text/plain");
		this.put(".lma", "audio/nspaudio");
		this.put(".lma", "audio/x-nspaudio");
		this.put(".log", "text/plain");
		this.put(".lsp", "application/x-lisp");
		this.put(".lsp", "text/x-script.lisp");
		this.put(".lst", "text/plain");
		this.put(".lsx", "text/x-la-asf");
		this.put(".ltx", "application/x-latex");
		this.put(".lzh", "application/octet-stream");
		this.put(".lzh", "application/x-lzh");
		this.put(".lzx", "application/lzx");
		this.put(".lzx", "application/octet-stream");
		this.put(".lzx", "application/x-lzx");
		this.put(".m", "text/plain");
		this.put(".m", "text/x-m");
		this.put(".m1v", "video/mpeg");
		this.put(".m2a", "audio/mpeg");
		this.put(".m2v", "video/mpeg");
		this.put(".m3u", "audio/x-mpequrl");
		this.put(".man", "application/x-troff-man");
		this.put(".map", "application/x-navimap");
		this.put(".mar", "text/plain");
		this.put(".mbd", "application/mbedlet");
		this.put(".mc$", "application/x-magic-cap-package-1.0");
		this.put(".mcd", "application/mcad");
		this.put(".mcd", "application/x-mathcad");
		this.put(".mcf", "image/vasa");
		this.put(".mcf", "text/mcf");
		this.put(".mcp", "application/netmc");
		this.put(".me", "application/x-troff-me");
		this.put(".mht", "message/rfc822");
		this.put(".mhtml", "message/rfc822");
		this.put(".mid", "application/x-midi");
		this.put(".mid", "audio/midi");
		this.put(".mid", "audio/x-mid");
		this.put(".mid", "audio/x-midi");
		this.put(".mid", "music/crescendo");
		this.put(".mid", "x-music/x-midi");
		this.put(".midi", "application/x-midi");
		this.put(".midi", "audio/midi");
		this.put(".midi", "audio/x-mid");
		this.put(".midi", "audio/x-midi");
		this.put(".midi", "music/crescendo");
		this.put(".midi", "x-music/x-midi");
		this.put(".mif", "application/x-frame");
		this.put(".mif", "application/x-mif");
		this.put(".mime", "message/rfc822");
		this.put(".mime", "www/mime");
		this.put(".mjf", "audio/x-vnd.audioexplosion.mjuicemediafile");
		this.put(".mjpg", "video/x-motion-jpeg");
		this.put(".mm", "application/base64");
		this.put(".mm", "application/x-meme");
		this.put(".mme", "application/base64");
		this.put(".mod", "audio/mod");
		this.put(".mod", "audio/x-mod");
		this.put(".moov", "video/quicktime");
		this.put(".mov", "video/quicktime");
		this.put(".movie", "video/x-sgi-movie");
		this.put(".mp2", "audio/mpeg");
		this.put(".mp2", "audio/x-mpeg");
		this.put(".mp2", "video/mpeg");
		this.put(".mp2", "video/x-mpeg");
		this.put(".mp2", "video/x-mpeq2a");
		this.put(".mp3", "audio/mpeg3");
		this.put(".mp3", "audio/x-mpeg-3");
		this.put(".mp3", "video/mpeg");
		this.put(".mp3", "video/x-mpeg");
		this.put(".mpa", "audio/mpeg");
		this.put(".mpa", "video/mpeg");
		this.put(".mpc", "application/x-project");
		this.put(".mpe", "video/mpeg");
		this.put(".mpeg", "video/mpeg");
		this.put(".mpg", "audio/mpeg");
		this.put(".mpg", "video/mpeg");
		this.put(".mpga", "audio/mpeg");
		this.put(".mpp", "application/vnd.ms-project");
		this.put(".mpt", "application/x-project");
		this.put(".mpv", "application/x-project");
		this.put(".mpx", "application/x-project");
		this.put(".mrc", "application/marc");
		this.put(".ms", "application/x-troff-ms");
		this.put(".mv", "video/x-sgi-movie");
		this.put(".my", "audio/make");
		this.put(".mzz", "application/x-vnd.audioexplosion.mzz");
		this.put(".nap", "image/naplps");
		this.put(".naplps", "image/naplps");
		this.put(".nc", "application/x-netcdf");
		this.put(".ncm", "application/vnd.nokia.configuration-message");
		this.put(".nif", "image/x-niff");
		this.put(".niff", "image/x-niff");
		this.put(".nix", "application/x-mix-transfer");
		this.put(".nsc", "application/x-conference");
		this.put(".nvd", "application/x-navidoc");
		this.put(".o", "application/octet-stream");
		this.put(".oda", "application/oda");
		this.put(".omc", "application/x-omc");
		this.put(".omcd", "application/x-omcdatamaker");
		this.put(".omcr", "application/x-omcregerator");
		this.put(".p", "text/x-pascal");
		this.put(".p10", "application/pkcs10");
		this.put(".p10", "application/x-pkcs10");
		this.put(".p12", "application/pkcs-12");
		this.put(".p12", "application/x-pkcs12");
		this.put(".p7a", "application/x-pkcs7-signature");
		this.put(".p7c", "application/pkcs7-mime");
		this.put(".p7c", "application/x-pkcs7-mime");
		this.put(".p7m", "application/pkcs7-mime");
		this.put(".p7m", "application/x-pkcs7-mime");
		this.put(".p7r", "application/x-pkcs7-certreqresp");
		this.put(".p7s", "application/pkcs7-signature");
		this.put(".part", "application/pro_eng");
		this.put(".pas", "text/pascal");
		this.put(".pbm", "image/x-portable-bitmap");
		this.put(".pcl", "application/vnd.hp-pcl");
		this.put(".pcl", "application/x-pcl");
		this.put(".pct", "image/x-pict");
		this.put(".pcx", "image/x-pcx");
		this.put(".pdb", "chemical/x-pdb");
		this.put(".pdf", "application/pdf");
		this.put(".pfunk", "audio/make");
		this.put(".pfunk", "audio/make.my.funk");
		this.put(".pgm", "image/x-portable-graymap");
		this.put(".pgm", "image/x-portable-greymap");
		this.put(".pic", "image/pict");
		this.put(".pict", "image/pict");
		this.put(".pkg", "application/x-newton-compatible-pkg");
		this.put(".pko", "application/vnd.ms-pki.pko");
		this.put(".pl", "text/plain");
		this.put(".pl", "text/x-script.perl");
		this.put(".plx", "application/x-pixclscript");
		this.put(".pm", "image/x-xpixmap");
		this.put(".pm", "text/x-script.perl-module");
		this.put(".pm4", "application/x-pagemaker");
		this.put(".pm5", "application/x-pagemaker");
		this.put(".png", "image/png");
		this.put(".pnm", "application/x-portable-anymap");
		this.put(".pnm", "image/x-portable-anymap");
		this.put(".pot", "application/mspowerpoint");
		this.put(".pot", "application/vnd.ms-powerpoint");
		this.put(".pov", "model/x-pov");
		this.put(".ppa", "application/vnd.ms-powerpoint");
		this.put(".ppm", "image/x-portable-pixmap");
		this.put(".pps", "application/mspowerpoint");
		this.put(".pps", "application/vnd.ms-powerpoint");
		this.put(".ppt", "application/mspowerpoint");
		this.put(".ppt", "application/powerpoint");
		this.put(".ppt", "application/vnd.ms-powerpoint");
		this.put(".ppt", "application/x-mspowerpoint");
		this.put(".ppz", "application/mspowerpoint");
		this.put(".pre", "application/x-freelance");
		this.put(".prt", "application/pro_eng");
		this.put(".ps", "application/postscript");
		this.put(".psd", "application/octet-stream");
		this.put(".pvu", "paleovu/x-pv");
		this.put(".pwz", "application/vnd.ms-powerpoint");
		this.put(".py", "text/x-script.phyton");
		this.put(".pyc", "applicaiton/x-bytecode.python");
		this.put(".qcp", "audio/vnd.qcelp");
		this.put(".qd3", "x-world/x-3dmf");
		this.put(".qd3d", "x-world/x-3dmf");
		this.put(".qif", "image/x-quicktime");
		this.put(".qt", "video/quicktime");
		this.put(".qtc", "video/x-qtc");
		this.put(".qti", "image/x-quicktime");
		this.put(".qtif", "image/x-quicktime");
		this.put(".ra", "audio/x-pn-realaudio");
		this.put(".ra", "audio/x-pn-realaudio-plugin");
		this.put(".ra", "audio/x-realaudio");
		this.put(".ram", "audio/x-pn-realaudio");
		this.put(".ras", "application/x-cmu-raster");
		this.put(".ras", "image/cmu-raster");
		this.put(".ras", "image/x-cmu-raster");
		this.put(".rast", "image/cmu-raster");
		this.put(".rexx", "text/x-script.rexx");
		this.put(".rf", "image/vnd.rn-realflash");
		this.put(".rgb", "image/x-rgb");
		this.put(".rm", "application/vnd.rn-realmedia");
		this.put(".rm", "audio/x-pn-realaudio");
		this.put(".rmi", "audio/mid");
		this.put(".rmm", "audio/x-pn-realaudio");
		this.put(".rmp", "audio/x-pn-realaudio");
		this.put(".rmp", "audio/x-pn-realaudio-plugin");
		this.put(".rng", "application/ringing-tones");
		this.put(".rng", "application/vnd.nokia.ringing-tone");
		this.put(".rnx", "application/vnd.rn-realplayer");
		this.put(".roff", "application/x-troff");
		this.put(".rp", "image/vnd.rn-realpix");
		this.put(".rpm", "audio/x-pn-realaudio-plugin");
		this.put(".rt", "text/richtext");
		this.put(".rt", "text/vnd.rn-realtext");
		this.put(".rtf", "application/rtf");
		this.put(".rtf", "application/x-rtf");
		this.put(".rtf", "text/richtext");
		this.put(".rtx", "application/rtf");
		this.put(".rtx", "text/richtext");
		this.put(".rv", "video/vnd.rn-realvideo");
		this.put(".s", "text/x-asm");
		this.put(".s3m", "audio/s3m");
		this.put(".saveme", "application/octet-stream");
		this.put(".sbk", "application/x-tbook");
		this.put(".scm", "application/x-lotusscreencam");
		this.put(".scm", "text/x-script.guile");
		this.put(".scm", "text/x-script.scheme");
		this.put(".scm", "video/x-scm");
		this.put(".sdml", "text/plain");
		this.put(".sdp", "application/sdp");
		this.put(".sdp", "application/x-sdp");
		this.put(".sdr", "application/sounder");
		this.put(".sea", "application/sea");
		this.put(".sea", "application/x-sea");
		this.put(".set", "application/set");
		this.put(".sgm", "text/sgml");
		this.put(".sgm", "text/x-sgml");
		this.put(".sgml", "text/sgml");
		this.put(".sgml", "text/x-sgml");
		this.put(".sh", "application/x-bsh");
		this.put(".sh", "application/x-sh");
		this.put(".sh", "application/x-shar");
		this.put(".sh", "text/x-script.sh");
		this.put(".shar", "application/x-bsh");
		this.put(".shar", "application/x-shar");
		this.put(".shtml", "text/html");
		this.put(".shtml", "text/x-server-parsed-html");
		this.put(".sid", "audio/x-psid");
		this.put(".sit", "application/x-sit");
		this.put(".sit", "application/x-stuffit");
		this.put(".skd", "application/x-koan");
		this.put(".skm", "application/x-koan");
		this.put(".skp", "application/x-koan");
		this.put(".skt", "application/x-koan");
		this.put(".sl", "application/x-seelogo");
		this.put(".smi", "application/smil");
		this.put(".smil", "application/smil");
		this.put(".snd", "audio/basic");
		this.put(".snd", "audio/x-adpcm");
		this.put(".sol", "application/solids");
		this.put(".spc", "application/x-pkcs7-certificates");
		this.put(".spc", "text/x-speech");
		this.put(".spl", "application/futuresplash");
		this.put(".spr", "application/x-sprite");
		this.put(".sprite", "application/x-sprite");
		this.put(".src", "application/x-wais-source");
		this.put(".ssi", "text/x-server-parsed-html");
		this.put(".ssm", "application/streamingmedia");
		this.put(".sst", "application/vnd.ms-pki.certstore");
		this.put(".step", "application/step");
		this.put(".stl", "application/sla");
		this.put(".stl", "application/vnd.ms-pki.stl");
		this.put(".stl", "application/x-navistyle");
		this.put(".stp", "application/step");
		this.put(".sv4cpio", "application/x-sv4cpio");
		this.put(".sv4crc", "application/x-sv4crc");
		this.put(".svf", "image/vnd.dwg");
		this.put(".svf", "image/x-dwg");
		this.put(".svr", "application/x-world");
		this.put(".svr", "x-world/x-svr");
		this.put(".swf", "application/x-shockwave-flash");
		this.put(".t", "application/x-troff");
		this.put(".talk", "text/x-speech");
		this.put(".tar", "application/x-tar");
		this.put(".tbk", "application/toolbook");
		this.put(".tbk", "application/x-tbook");
		this.put(".tcl", "application/x-tcl");
		this.put(".tcl", "text/x-script.tcl");
		this.put(".tcsh", "text/x-script.tcsh");
		this.put(".tex", "application/x-tex");
		this.put(".texi", "application/x-texinfo");
		this.put(".texinfo", "application/x-texinfo");
		this.put(".text", "application/plain");
		this.put(".text", "text/plain");
		this.put(".tgz", "application/gnutar");
		this.put(".tgz", "application/x-compressed");
		this.put(".tif", "image/tiff");
		this.put(".tif", "image/x-tiff");
		this.put(".tiff", "image/tiff");
		this.put(".tiff", "image/x-tiff");
		this.put(".tr", "application/x-troff");
		this.put(".tsi", "audio/tsp-audio");
		this.put(".tsp", "application/dsptype");
		this.put(".tsp", "audio/tsplayer");
		this.put(".tsv", "text/tab-separated-values");
		this.put(".turbot", "image/florian");
		this.put(".txt", "text/plain");
		this.put(".uil", "text/x-uil");
		this.put(".uni", "text/uri-list");
		this.put(".unis", "text/uri-list");
		this.put(".unv", "application/i-deas");
		this.put(".uri", "text/uri-list");
		this.put(".uris", "text/uri-list");
		this.put(".ustar", "application/x-ustar");
		this.put(".ustar", "multipart/x-ustar");
		this.put(".uu", "application/octet-stream");
		this.put(".uu", "text/x-uuencode");
		this.put(".uue", "text/x-uuencode");
		this.put(".vcd", "application/x-cdlink");
		this.put(".vcs", "text/x-vcalendar");
		this.put(".vda", "application/vda");
		this.put(".vdo", "video/vdo");
		this.put(".vew", "application/groupwise");
		this.put(".viv", "video/vivo");
		this.put(".viv", "video/vnd.vivo");
		this.put(".vivo", "video/vivo");
		this.put(".vivo", "video/vnd.vivo");
		this.put(".vmd", "application/vocaltec-media-desc");
		this.put(".vmf", "application/vocaltec-media-file");
		this.put(".voc", "audio/voc");
		this.put(".voc", "audio/x-voc");
		this.put(".vos", "video/vosaic");
		this.put(".vox", "audio/voxware");
		this.put(".vqe", "audio/x-twinvq-plugin");
		this.put(".vqf", "audio/x-twinvq");
		this.put(".vql", "audio/x-twinvq-plugin");
		this.put(".vrml", "application/x-vrml");
		this.put(".vrml", "model/vrml");
		this.put(".vrml", "x-world/x-vrml");
		this.put(".vrt", "x-world/x-vrt");
		this.put(".vsd", "application/x-visio");
		this.put(".vst", "application/x-visio");
		this.put(".vsw", "application/x-visio");
		this.put(".w60", "application/wordperfect6.0");
		this.put(".w61", "application/wordperfect6.1");
		this.put(".w6w", "application/msword");
		this.put(".wav", "audio/wav");
		this.put(".wav", "audio/x-wav");
		this.put(".wb1", "application/x-qpro");
		this.put(".wbmp", "image/vnd.wap.wbmp");
		this.put(".web", "application/vnd.xara");
		this.put(".wiz", "application/msword");
		this.put(".wk1", "application/x-123");
		this.put(".wmf", "windows/metafile");
		this.put(".wml", "text/vnd.wap.wml");
		this.put(".wmlc", "application/vnd.wap.wmlc");
		this.put(".wmls", "text/vnd.wap.wmlscript");
		this.put(".wmlsc", "application/vnd.wap.wmlscriptc");
		this.put(".word", "application/msword");
		this.put(".wp", "application/wordperfect");
		this.put(".wp5", "application/wordperfect");
		this.put(".wp5", "application/wordperfect6.0");
		this.put(".wp6", "application/wordperfect");
		this.put(".wpd", "application/wordperfect");
		this.put(".wpd", "application/x-wpwin");
		this.put(".wq1", "application/x-lotus");
		this.put(".wri", "application/mswrite");
		this.put(".wri", "application/x-wri");
		this.put(".wrl", "application/x-world");
		this.put(".wrl", "model/vrml");
		this.put(".wrl", "x-world/x-vrml");
		this.put(".wrz", "model/vrml");
		this.put(".wrz", "x-world/x-vrml");
		this.put(".wsc", "text/scriplet");
		this.put(".wsrc", "application/x-wais-source");
		this.put(".wtk", "application/x-wintalk");
		this.put(".xbm", "image/x-xbitmap");
		this.put(".xbm", "image/x-xbm");
		this.put(".xbm", "image/xbm");
		this.put(".xdr", "video/x-amt-demorun");
		this.put(".xgz", "xgl/drawing");
		this.put(".xif", "image/vnd.xiff");
		this.put(".xl", "application/excel");
		this.put(".xla", "application/excel");
		this.put(".xla", "application/x-excel");
		this.put(".xla", "application/x-msexcel");
		this.put(".xlb", "application/excel");
		this.put(".xlb", "application/vnd.ms-excel");
		this.put(".xlb", "application/x-excel");
		this.put(".xlc", "application/excel");
		this.put(".xlc", "application/vnd.ms-excel");
		this.put(".xlc", "application/x-excel");
		this.put(".xld", "application/excel");
		this.put(".xld", "application/x-excel");
		this.put(".xlk", "application/excel");
		this.put(".xlk", "application/x-excel");
		this.put(".xll", "application/excel");
		this.put(".xll", "application/vnd.ms-excel");
		this.put(".xll", "application/x-excel");
		this.put(".xlm", "application/excel");
		this.put(".xlm", "application/vnd.ms-excel");
		this.put(".xlm", "application/x-excel");
		this.put(".xls", "application/excel");
		this.put(".xls", "application/vnd.ms-excel");
		this.put(".xls", "application/x-excel");
		this.put(".xls", "application/x-msexcel");
		this.put(".xlt", "application/excel");
		this.put(".xlt", "application/x-excel");
		this.put(".xlv", "application/excel");
		this.put(".xlv", "application/x-excel");
		this.put(".xlw", "application/excel");
		this.put(".xlw", "application/vnd.ms-excel");
		this.put(".xlw", "application/x-excel");
		this.put(".xlw", "application/x-msexcel");
		this.put(".xm", "audio/xm");
		this.put(".xml", "application/xml");
		this.put(".xml", "text/xml");
		this.put(".xmz", "xgl/movie");
		this.put(".xpix", "application/x-vnd.ls-xpix");
		this.put(".xpm", "image/x-xpixmap");
		this.put(".xpm", "image/xpm");
		this.put(".x-png", "image/png");
		this.put(".xsr", "video/x-amt-showrun");
		this.put(".xwd", "image/x-xwd");
		this.put(".xwd", "image/x-xwindowdump");
		this.put(".xyz", "chemical/x-pdb");
		this.put(".z", "application/x-compress");
		this.put(".z", "application/x-compressed");
		this.put(".zip", "application/x-compressed");
		this.put(".zip", "application/x-zip-compressed");
		this.put(".zip", "application/zip");
		this.put(".zip", "multipart/x-zip");
		this.put(".zoo", "application/octet-stream");
		this.put(".zsh", "text/x-script.zsh");
	}

	public static String getType(String key) {
		MimeTypes mimes = new MimeTypes();
		return mimes.get(key);
	}
}