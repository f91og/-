//创建自己的内容提供器
public class MyProvider extends ContentProvider{  //1.需要继承ContentProvider类.2.需要重写6个方法
	
	public static final int TABLE_DIR=0;
	public static final int TABLE_ITEM=1;
	public static final int TABLE2_DIR=2;
	public static final int TABLE2_ITEM=3;
	private static UriMatcher uriMatcher;//借助UriMatcher这个类
	
	static{
		uriMatcher=new UriMatcher(UriMatcher.NO_MATCH);
		uriMatcher.addURI("com.example.app.provider","table1",TABLE_DIR);
	}
	
	public boolean onCreate(){
		retun false;
	}
	
	public Cursor query(Uri uri,String[] projection,String selection,String[] selectionArgs,String sortOrder){
		retun null;
	}
	
	public Uri insert(Uri uri,ContentValues values){
		return null;
	}
	
	public int update(Uri uri,ContentValues values,String selection,String selectionArgs){
		return 0;
	}
	
	public int delete(Uri uri,String selection,String[] selectionArgs){
		return 0;
	}
	
	public String getType(Uri uri){
		return null;
	}
}