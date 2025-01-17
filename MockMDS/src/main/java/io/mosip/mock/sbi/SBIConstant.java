package io.mosip.mock.sbi;

public class SBIConstant {
	/** SBI Min Port Number. */
	public static String MIN_PORT = "server.minport";
	/** SBI Max Port Number. */
	public static String MAX_PORT = "server.maxport";

	/** SBI Server IP Address. */
	public static final String SERVER_ADDRESS = "server.serveripaddress";

	/** CORS HEADERS METHODS */
	public static final String CORS_HEADER_METHODS = "cors.headers.allowed.methods";
	
	/** Environment */
    public static String ENVIRONMENT_NONE = "None";
    public static String ENVIRONMENT_STAGING = "Staging";
    public static String ENVIRONMENT_DEVELOPER = "Developer";
    public static String ENVIRONMENT_PRE_PRODUCTION = "Pre-Production";
    public static String ENVIRONMENT_PRODUCTION = "Production";

	/** Purpose */
    public static String PURPOSE_AUTH = "Auth";
    public static String PURPOSE_REGISTRATION = "Registration";

	/** Device Status */
    public static String DEVICE_STATUS					= "DEVICE_STATUS";
    public static String DEVICE_STATUS_ISREADY        	= "Ready";
    public static String DEVICE_STATUS_ISUSED         	= "Busy";
    public static String DEVICE_STATUS_NOTREADY    		= "Not Ready";
    public static String DEVICE_STATUS_NOTREGISTERED  	= "Not Registered";
    public static String BIOMETRIC_VERSION				= "1.0";

	/** Device SubType Id Value */
    public static int DEVICE_IRIS_SUB_TYPE_ID_LEFT  = 1;	// LEFT IRIS IMAGE
    public static int DEVICE_IRIS_SUB_TYPE_ID_RIGHT = 2;	// RIGHT IRIS IMAGE
    public static int DEVICE_IRIS_SUB_TYPE_ID_BOTH  = 3;	// BOTH LEFT AND RIGHT IRIS IMAGE
    public static int DEVICE_FINGER_SLAP_SUB_TYPE_ID_LEFT  = 1;	// LEFT SLAP IMAGE
    public static int DEVICE_FINGER_SLAP_SUB_TYPE_ID_RIGHT = 2;	// RIGHT SLAP IMAGE
    public static int DEVICE_FINGER_SLAP_SUB_TYPE_ID_THUMB  = 3;// TWO THUMB IMAGE
    public static int DEVICE_FACE_SUB_TYPE_ID_FULLFACE  = 0;    // TWO THUMB IMAGE
    
	/** Bio Exceptions/Bio Subtype Names */
	public static String BIO_NAME_UNKNOWN = "UNKNOWN";
	public static String BIO_NAME_RIGHT_THUMB = "Right Thumb";
	public static String BIO_NAME_RIGHT_INDEX = "Right IndexFinger";
	public static String BIO_NAME_RIGHT_MIDDLE = "Right MiddleFinger";
	public static String BIO_NAME_RIGHT_RING = "Right RingFinger";
	public static String BIO_NAME_RIGHT_LITTLE = "Right LittleFinger";
	public static String BIO_NAME_LEFT_THUMB = "Left Thumb";
	public static String BIO_NAME_LEFT_INDEX = "Left IndexFinger";
	public static String BIO_NAME_LEFT_MIDDLE = "Left MiddleFinger";
	public static String BIO_NAME_LEFT_RING = "Left RingFinger";
	public static String BIO_NAME_LEFT_LITTLE = "Left LittleFinger";
	public static String BIO_NAME_RIGHT_IRIS = "Right";
	public static String BIO_NAME_LEFT_IRIS = "Left";
     
	/** Profile Bio File Names */
	public static String PROFILE_BIO_FILE_NAME_RIGHT_THUMB = "Right_Thumb.iso";
	public static String PROFILE_BIO_FILE_NAME_RIGHT_INDEX = "Right_Index.iso";
	public static String PROFILE_BIO_FILE_NAME_RIGHT_MIDDLE = "Right_Middle.iso";
	public static String PROFILE_BIO_FILE_NAME_RIGHT_RING = "Right_Ring.iso";
	public static String PROFILE_BIO_FILE_NAME_RIGHT_LITTLE = "Right_Little.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_THUMB = "Left_Thumb.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_INDEX = "Left_Index.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_MIDDLE = "Left_Middle.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_RING = "Left_Ring.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_LITTLE = "Left_Little.iso";
	public static String PROFILE_BIO_FILE_NAME_RIGHT_IRIS = "Right_Iris.iso";
	public static String PROFILE_BIO_FILE_NAME_LEFT_IRIS = "Left_Iris.iso";
	public static String PROFILE_BIO_FILE_NAME_FACE = "Face.iso";
	public static String PROFILE_BIO_FILE_NAME_FACE_EXCEPTION = "Exception_Photo.iso";

	/** Errors */
	public static final String Error_Code_100 = "mds_ERROR_100_msg_en";

	public static final String Error_Code_500 = "mds_ERROR_500_msg_en";
	public static final String Error_Code_501 = "mds_ERROR_501_msg_en";
	public static final String Error_Code_502 = "mds_ERROR_502_msg_en";
	public static final String Error_Code_503 = "mds_ERROR_503_msg_en";

	public static final String Error_Code_551 = "mds_ERROR_551_msg_en";

	public static final String Error_Code_601 = "mds_ERROR_601_msg_en";
	public static final String Error_Code_604 = "mds_ERROR_604_msg_en";
	public static final String Error_Code_605 = "mds_ERROR_605_msg_en";
	public static final String Error_Code_606 = "mds_ERROR_606_msg_en";
	public static final String Error_Code_607 = "mds_ERROR_607_msg_en";
	public static final String Error_Code_608 = "mds_ERROR_608_msg_en";
	public static final String Error_Code_610 = "mds_ERROR_610_msg_en";

	public static final String Error_Code_700 = "mds_ERROR_700_msg_en";
	public static final String Error_Code_701 = "mds_ERROR_701_msg_en";
	public static final String Error_Code_702 = "mds_ERROR_702_msg_en";
	public static final String Error_Code_703 = "mds_ERROR_703_msg_en";
	public static final String Error_Code_704 = "mds_ERROR_704_msg_en";
	public static final String Error_Code_705 = "mds_ERROR_705_msg_en";
	public static final String Error_Code_706 = "mds_ERROR_706_msg_en";
	public static final String Error_Code_707 = "mds_ERROR_707_msg_en";
	public static final String Error_Code_708 = "mds_ERROR_708_msg_en";
	public static final String Error_Code_709 = "mds_ERROR_709_msg_en";
	public static final String Error_Code_710 = "mds_ERROR_710_msg_en";

	public static final String Error_Code_800 = "mds_ERROR_800_msg_en";
	public static final String Error_Code_801 = "mds_ERROR_801_msg_en";
	public static final String Error_Code_803 = "mds_ERROR_803_msg_en";
	public static final String Error_Code_804 = "mds_ERROR_804_msg_en";
	public static final String Error_Code_805 = "mds_ERROR_805_msg_en";
	public static final String Error_Code_806 = "mds_ERROR_806_msg_en";
	public static final String Error_Code_809 = "mds_ERROR_809_msg_en";
	public static final String Error_Code_810 = "mds_ERROR_810_msg_en";

	public static final String Error_Code_999 = "mds_ERROR_999_msg_en";
		
	/** Mosip Verbs */
	public static String MOSIP_POST_VERB = "POST / HTTP";
	public static String MOSIP_GET_VERB = "GET / HTTP";
	public static String MOSIP_DISC_VERB = "MOSIPDISC /device HTTP";
	public static String MOSIP_SBI_DISC_VERB = "SBIDISC /device HTTP";
	public static String MOSIP_INFO_VERB = "MOSIPDINFO /info HTTP";
	public static String MOSIP_INFO_SBI_VERB = "SBIINFO /info HTTP";
	public static String MOSIP_CAPTURE_VERB = "CAPTURE /capture HTTP";
	public static String MOSIP_STREAM_VERB = "STREAM /stream HTTP";
	public static String MOSIP_RCAPTURE_VERB = "RCAPTURE /capture HTTP";
	public static String MOSIP_SETPROFILE_VERB = "SETPROFILE /profile HTTP";
		
	/** Command Line Arguments Names */
	public static String MOSIP_PURPOSE = "mosip.mock.sbi.device.purpose";
	public static String MOSIP_BIOMETRIC_TYPE = "mosip.mock.sbi.biometric.type";
	public static String MOSIP_BIOMETRIC_VERSION = "mosip.mock.sbi.biometric.version";

	/** Device Purpose Names */
	public static String MOSIP_PURPOSE_REGISTRATION = "mosip.mock.sbi.device.purpose.registration";
	public static String MOSIP_PURPOSE_AUTH = "mosip.mock.sbi.device.purpose.auth";

	/** Biometric Types Names */
	public static String MOSIP_BIOMETRIC_TYPE_BIOMTRIC_DEVICE = "mosip.mock.sbi.biometric.type.biometricdevice";
	public static String MOSIP_BIOMETRIC_TYPE_FINGER = "mosip.mock.sbi.biometric.type.finger";
	public static String MOSIP_BIOMETRIC_TYPE_FACE = "mosip.mock.sbi.biometric.type.face";
	public static String MOSIP_BIOMETRIC_TYPE_IRIS = "mosip.mock.sbi.biometric.type.iris";
			
	/** Biometric Sub Types Names */
	public static String MOSIP_BIOMETRIC_SUBTYPE_FINGER_SLAP = "mosip.mock.sbi.biometric.subtype.finger.slap";
	public static String MOSIP_BIOMETRIC_SUBTYPE_FINGER_SINGLE = "mosip.mock.sbi.biometric.subtype.finger.single";
	public static String MOSIP_BIOMETRIC_SUBTYPE_FINGER_TOUCHLESS = "mosip.mock.sbi.biometric.subtype.finger.touchless";
	public static String MOSIP_BIOMETRIC_SUBTYPE_FACE = "mosip.mock.sbi.biometric.subtype.face";
	public static String MOSIP_BIOMETRIC_SUBTYPE_IRIS_SINGLE = "mosip.mock.sbi.biometric.subtype.iris.single";
	public static String MOSIP_BIOMETRIC_SUBTYPE_IRIS_DOUBLE = "mosip.mock.sbi.biometric.subtype.iris.double";

	/** Biometric Face DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_FACE_DIGITALID_JSON = "mosip.mock.sbi.file.face.digitalid.json";
	public static String MOSIP_FACE_DEVICEINFO_JSON = "mosip.mock.sbi.file.face.deviceinfo.json";
	public static String MOSIP_FACE_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.face.devicediscovery.json";
	public static String MOSIP_STREAM_FACE_SUBID_FULLFACE = "mosip.mock.sbi.file.face.streamimage";
	public static String MOSIP_STREAM_FACE_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.face.keys.keystorefilename";
	public static String MOSIP_STREAM_FACE_KEY_ALIAS = "mosip.mock.sbi.file.face.keys.keyalias";
	public static String MOSIP_STREAM_FACE_KEYSTORE_PWD = "mosip.mock.sbi.file.face.keys.keystorepwd";
	public static String MOSIP_STREAM_FACE_MOSIP_KEY = "mosip.mock.sbi.file.face.keys.encryption";
	
	/** Biometric Finger DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_FINGER_SLAP_DIGITALID_JSON = "mosip.mock.sbi.file.finger.slap.digitalid.json";
	public static String MOSIP_FINGER_SLAP_DEVICEINFO_JSON = "mosip.mock.sbi.file.finger.slap.deviceinfo.json";
	public static String MOSIP_FINGER_SLAP_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.finger.slap.devicediscovery.json";
	public static String MOSIP_STREAM_FINGER_SLAP_SUBID_LEFT_HAND = "mosip.mock.sbi.file.finger.slap.streamimage.left";
	public static String MOSIP_STREAM_FINGER_SLAP_SUBID_RIGHT_HAND = "mosip.mock.sbi.file.finger.slap.streamimage.right";
	public static String MOSIP_STREAM_FINGER_SLAP_SUBID_THUMBS = "mosip.mock.sbi.file.finger.slap.streamimage.thumb";
	public static String MOSIP_STREAM_FINGER_SLAP_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.finger.slap.keys.keystorefilename";
	public static String MOSIP_STREAM_FINGER_SLAP_KEY_ALIAS = "mosip.mock.sbi.file.finger.slap.keys.keyalias";
	public static String MOSIP_STREAM_FINGER_SLAP_KEYSTORE_PWD = "mosip.mock.sbi.file.finger.slap.keys.keystorepwd";
	public static String MOSIP_STREAM_FINGER_SLAP_MOSIP_KEY = "mosip.mock.sbi.file.finger.slap.keys.encryption";
	
	/** Biometric Iris DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_IRIS_DOUBLE_DIGITALID_JSON = "mosip.mock.sbi.file.iris.double.digitalid.json";
	public static String MOSIP_IRIS_DOUBLE_DEVICEINFO_JSON = "mosip.mock.sbi.file.iris.double.deviceinfo.json";
	public static String MOSIP_IRIS_DOUBLE_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.iris.double.devicediscovery.json";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SUBID_BOTH = "mosip.mock.sbi.file.iris.double.streamimage.both";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SUBID_LEFT = "mosip.mock.sbi.file.iris.double.streamimage.left";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SUBID_RIGHT = "mosip.mock.sbi.file.iris.double.streamimage.right";
	public static String MOSIP_STREAM_IRIS_DOUBLE_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.iris.double.keys.keystorefilename";
	public static String MOSIP_STREAM_IRIS_DOUBLE_KEY_ALIAS = "mosip.mock.sbi.file.iris.double.keys.keyalias";
	public static String MOSIP_STREAM_IRIS_DOUBLE_KEYSTORE_PWD = "mosip.mock.sbi.file.iris.double.keys.keystorepwd";
	public static String MOSIP_STREAM_IRIS_DOUBLE_MOSIP_KEY = "mosip.mock.sbi.file.iris.double.keys.encryption";	
	
	public static String MOSIP_PROFILE_FOLDER_PATH = "mosip.mock.sbi.folder.profile";
	public static String MOSIP_PROFILE_DEFAULT_FOLDER_PATH = "mosip.mock.sbi.file.folder.default";	
	
	/**  SBI 1.0 Biometric Finger DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_FINGER_SLAP_SBI_DIGITALID_JSON = "mosip.mock.sbi.file.finger.slap.sbi.digitalid.json";
	public static String MOSIP_FINGER_SLAP_SBI_DEVICEINFO_JSON = "mosip.mock.sbi.file.finger.slap.sbi.deviceinfo.json";
	public static String MOSIP_FINGER_SLAP_SBI_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.finger.slap.sbi.devicediscovery.json";
	public static String MOSIP_STREAM_FINGER_SLAP_SBI_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.finger.slap.sbi.keys.keystorefilename";
	public static String MOSIP_STREAM_FINGER_SLAP_SBI_KEY_ALIAS = "mosip.mock.sbi.file.finger.slap.sbi.keys.keyalias";
	public static String MOSIP_STREAM_FINGER_SLAP_SBI_KEYSTORE_PWD = "mosip.mock.sbi.file.finger.slap.sbi.keys.keystorepwd";
	
	/** SBI 1.0 Biometric Face DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_FACE_SBI_DIGITALID_JSON = "mosip.mock.sbi.file.face.sbi.digitalid.json";
	public static String MOSIP_FACE_SBI_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.face.sbi.devicediscovery.json";
	public static String MOSIP_FACE_SBI_DEVICEINFO_JSON = "mosip.mock.sbi.file.face.sbi.deviceinfo.json";
	public static String MOSIP_STREAM_FACE_SBI_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.face.sbi.keys.keystorefilename";
	public static String MOSIP_STREAM_FACE_SBI_KEY_ALIAS = "mosip.mock.sbi.file.face.sbi.keys.keyalias";
	public static String MOSIP_STREAM_FACE_SBI_KEYSTORE_PWD = "mosip.mock.sbi.file.face.sbi.keys.keystorepwd";
	
	/** SBI 1.0 Biometric Iris DeviceDigitalId, DeviceDiscover, DeviceInfo Json and Stream Images, Device Keys, Mosip Public Key Info */
	public static String MOSIP_IRIS_DOUBLE_SBI_DIGITALID_JSON = "mosip.mock.sbi.file.iris.double.sbi.digitalid.json";
	public static String MOSIP_IRIS_DOUBLE_SBI_DEVICEDEISCOVERYINFO_JSON = "mosip.mock.sbi.file.iris.double.sbi.devicediscovery.json";
	public static String MOSIP_IRIS_DOUBLE_SBI_DEVICEINFO_JSON = "mosip.mock.sbi.file.iris.double.sbi.deviceinfo.json";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SBI_KEYSTORE_FILE_NAME = "mosip.mock.sbi.file.iris.double.sbi.keys.keystorefilename";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SBI_KEY_ALIAS = "mosip.mock.sbi.file.iris.double.sbi.keys.keyalias";
	public static String MOSIP_STREAM_IRIS_DOUBLE_SBI_KEYSTORE_PWD = "mosip.mock.sbi.file.iris.double.sbi.keys.keystorepwd";
}
