package command_1;


class FanOnCmd implements Command{
        private GFan fan;
        public FanOnCmd ( GFan fan) {
                this.fan  =  fan;
        }
        public void execute( ) {
                fan.startRotate( );
        }
}
