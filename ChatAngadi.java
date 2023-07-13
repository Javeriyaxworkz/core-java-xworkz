class ChatAngadi{

    public static void main(String chat[]){
	
	// for local variables 
	String chatNames[] = {"Bhel puri", "Pani Puri", "Samosa"};
	//argument
	getChatNames(chatNames);  //no of arguments = no of declarations/ parameters 
	}

    public static void getChatNames(String chatNames[]){
	System.out.println("Get the chat names menu sir!!!!!!!");
	for(String chatName : chatNames)
	{
	    System.out.println(chatName);
	}
}


}
