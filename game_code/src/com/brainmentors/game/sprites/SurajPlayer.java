package com.brainmentors.game.sprites;

public class SurajPlayer extends Player{
	public SurajPlayer() throws Exception {
		super(SURAJ_IMAGE);
		x=BOARD_WIDTH-450;
	}
      @Override
    	   protected void kickAction() {
  		   isAttacking=true;
           	kick[0] = fullImage.getSubimage(1912, 320, 50, 114);
           	kick[1] = fullImage.getSubimage(1811, 324, 59, 106);
           	kick[2] = fullImage.getSubimage(1669, 323, 94, 104);
           	kick[3] = fullImage.getSubimage(1530, 312, 102, 117);
           	kick[4] = fullImage.getSubimage(1396, 305, 99, 114);
           	kick[5] = fullImage.getSubimage(1294, 301, 62, 109);
           	kick[6] = fullImage.getSubimage(1172, 304, 69, 106);
           	kick[7] = fullImage.getSubimage(1049, 295, 78, 113);
           }
      @Override
           protected void defaultAction() {
  		 isAttacking=false;
           	defaultMove[0] = fullImage.getSubimage(47, 1147, 69, 117);
           	defaultMove[1] = fullImage.getSubimage(162, 1145, 63, 120);
           	defaultMove[2] = fullImage.getSubimage(285, 1144, 57, 117);
           	defaultMove[3] = fullImage.getSubimage(410, 1140, 55, 120);
//           	defaultMove[4] = fullImage.getSubimage(535, 1143, 54, 119);
//           	defaultMove[5] = fullImage.getSubimage(666, 1147, 55, 118);
//           	defaultMove[6] = fullImage.getSubimage(791, 1153, 60, 114);
//           	defaultMove[7] = fullImage.getSubimage(926, 1152, 61, 115);
           	defaultMove[4] = fullImage.getSubimage(47, 1147, 69, 117);
           	defaultMove[5] = fullImage.getSubimage(162, 1145, 63, 120);
           	defaultMove[6] = fullImage.getSubimage(285, 1144, 57, 117);
           	defaultMove[7] = fullImage.getSubimage(410, 1140, 55, 120);
         	//defaultMove[8] = fullImage.getSubimage(412, 1137, 52, 125);
           }
	@Override
	protected void hit() {
//		 hitMove[0]= fullImage.getSubimage(981,1839,59,108);        //jump rolling
//		 hitMove[1]= fullImage.getSubimage(869,1843,57,130);
//		 hitMove[2]= fullImage.getSubimage(763,1845,56,117);
//		 hitMove[3]= fullImage.getSubimage(643,1852,81,65);
//		 hitMove[4]= fullImage.getSubimage(543,1842,64,72);
//		 hitMove[5]= fullImage.getSubimage(420,1845,73,76);
//		 hitMove[6]= fullImage.getSubimage(292,1862,77,66);
//		 hitMove[7]= fullImage.getSubimage(164,1831,60,109);	
		 hitMove[0]= fullImage.getSubimage(46,2336,62,116);       //to protect
		 hitMove[1]= fullImage.getSubimage(176,2336,71,116);
		 hitMove[2]= fullImage.getSubimage(331,2342,82,114);
		 hitMove[3]= fullImage.getSubimage(469,2348,94,109);
		 hitMove[4]= fullImage.getSubimage(46,2336,62,116);
		 hitMove[5]= fullImage.getSubimage(176,2336,71,116);
		 hitMove[6]= fullImage.getSubimage(331,2342,82,114);
		 hitMove[7]= fullImage.getSubimage(469,2348,94,109);
		
	}

       }

