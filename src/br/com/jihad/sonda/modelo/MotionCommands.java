package br.com.jihad.sonda.modelo;

public class MotionCommands {

    public void command(String commands, Sonda sonda) {
        char[] commandList = commands.toCharArray();

        for (char command : commandList) {

            switch (command) {
                case 'L':
                    sonda.turn('L');
                    break;
                case 'R':
                    sonda.turn('R');
                    break;
                case 'M':
                    sonda.move();
                    break;
                default:
                    throw new RuntimeException("Este não é um comando válido.");
            }
        }

    }
}
