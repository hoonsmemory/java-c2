package chapter02;

public class TV {
	int channel;
	int volume;
	boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume  = volume;
		this.power   = power;
	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	
	public void power(boolean powerOn) {
		// TODO Auto-generated method stub
		if(powerOn) {
			this.power = powerOn;
			System.out.println("TV가 켜졌습니다.");
		}else {
			this.power = powerOn;
			System.out.println("TV가 꺼졌습니다.");
		}
	}

	public void volume(int volume) {
		if(volume >= 1 && volume <= 100) {
			System.out.println(this.volume + "으로 이동했습니다.");
		}else if (volume > 101){
			this.volume = 100;
			System.out.println("볼륨 최대는 100입니다.");
		}else if(volume < 0) {
			this.volume = 0;
			System.out.println("볼륨 최소는 100입니다.");
		}		
	}
	
	public void volume(Boolean volume) {
		if(this.volume > 0 && this.volume < 100) {
			if(volume)
				System.out.println((++this.volume) + "으로 이동했습니다.");
			else
				System.out.println((--this.volume) + "으로 이동했습니다.");
		}else {
			System.out.println("1 ~ 100까지 입력할 수 있습니다. 다시 입력하세요");
		}		
	}

	public void channel(int channel) {
		if(channel >= 1 && channel <= 255) {
			System.out.println(this.channel + "번으로 이동했습니다.");
		}else if (channel > 256){
			this.channel = 255;
			System.out.println("채널 최대는 255입니다.");
		}else if(channel < 0) {
			this.channel = 0;
			System.out.println("채널 최소는 0입니다.");
		}	
		
	}
 
	public void channel(Boolean channel) {
		if(this.channel > 0 && this.channel < 255) {
			if(channel)
				System.out.println((++this.channel) + "번으로 이동했습니다.");
			else
				System.out.println((--this.channel) + "번으로 이동했습니다.");
		}else {
			System.out.println("1 ~ 255까지 입력할 수 있습니다. 다시 입력하세요");
		}	
		
	}
}
