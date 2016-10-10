	//ListView使用之设置适配器
	ListView contactsView;
	ArrayAdapter<String> adapter;
	.......
	contactsView=(ListView)findViewById(R.id.contacts_view);
	adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contactList);
	contactsView.setAdapter(adapter);