package com.Lab3.Task1;

public class Task1 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam in congue diam. Morbi convallis metus ante, sed porta massa rutrum ac. " +
                "Nunc ut nulla congue, feugiat libero sed, cursus eros. Vivamus ultricies tincidunt dui, egestas egestas justo elementum in. " +
                "Vestibulum sollicitudin nisi sed enim bibendum, nec accumsan quam euismod." +
                " Aliquam consequat, neque at tincidunt ornare, leo nisl lacinia sem, vitae sodales elit libero eget arcu." +
                " Suspendisse cursus eros neque, id feugiat turpis vestibulum eu. Nam facilisis at quam cursus interdum." +
                " Nunc vitae rutrum arcu. Etiam et tincidunt lectus. Nam nec tristique risus. Proin ut tellus consectetur, tincidunt lacus lobortis, interdum orci." +
                " Vivamus gravida metus id lectus posuere dignissim.\n" +
                "\n" +
                "Ut rhoncus urna non pharetra imperdiet. Ut vitae lectus volutpat, venenatis nisi ut, placerat diam. " +
                "Nam vestibulum massa nisl, in ornare arcu facilisis et." +
                " Cras pretium, mi eget interdum pellentesque, lorem metus pellentesque erat, viverra condimentum sapien orci id metus." +
                " Suspendisse nec lacinia erat, vitae congue lectus. Morbi ut dapibus mauris. Duis eu sagittis lectus. " +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. " +
                "Aenean eleifend urna ut tortor suscipit vulputate at ac odio. Praesent libero est, placerat vitae fringilla eu, dictum ut orci. Suspendisse mauris arcu, tempor.";


        TextManipulator tx = new TextManipulator();
        tx.numberSentences(s);
        tx.showWords(s);
    }
}
