
package servlet;


public class Factory {
    
    private static Factory instance = new Factory();
    
    private Factory(){}
    
    public static Factory getInstance(){
        
        return instance;
    }
    
    
    public type creattype(String typetype){
   
       if ("admin".equals(type)){
       
       return new Administrador();
       
                                    }
       
       if (type.equals("normal")){
       
       return new Normal();
       
                                    }
       
       if (type.equals("invitado")){
       
       return new Invitado();
       
                                    }
       
       return null;
   
   }
}
