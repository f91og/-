//一个使用ContentResolver读取联系人信息的例子
private void readContact(){
		Cursor cursor=null;
		try{
			cursor=getContentResolver().query(
					ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
			while(cursor.moveToNext()){
				String displayName=cursor.getString(cursor.getColumnIndex(
						ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
				String number=cursor.getString(cursor.getColumnIndex(
						ContactsContract.CommonDataKinds.Phone.NUMBER));
				contactsList.add(displayName+"\n"+number);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(cursor!=null){
				cursor.close();
			}
		}
	}