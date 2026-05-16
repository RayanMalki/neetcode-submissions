class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> mapCarre = new HashMap<>();
        for (int i =0; i<9; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for (int j =0; j<9; j++){
                if(board[i][j] != '.'){
                    map.put(board[i][j],map.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = map.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }

        for (int j =0; j<9; j++){
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i =0; i<9; i++){
                if(board[i][j] != '.'){
                    map.put(board[i][j],map.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = map.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }

        for (int i =0; i<3; i++){ 
            for (int j =0; j<3; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =0; i<3; i++){
            for (int j =3; j<6; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =0; i<3; i++){  
            for (int j =6; j<9; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =3; i<6; i++){
            for (int j =0; j<3; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =3; i<6; i++){
            for (int j =3; j<6; j++){
           
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =3; i<6; i++){
            for (int j =6; j<9; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =6; i<9; i++){
            for (int j =0; j<3; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =6; i<9; i++){
            for (int j =3; j<6; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        mapCarre.clear();

        for (int i =6; i<9; i++){
            for (int j =6; j<9; j++){
                if(board[i][j] != '.'){
                    mapCarre.put(board[i][j],mapCarre.getOrDefault(board[i][j],0)+1);
                }
            }
            boolean hasKey = mapCarre.values().stream().anyMatch(k -> k > 1);
            if(hasKey){
                return false;
            }
        }
        
        return true;
    }
}
