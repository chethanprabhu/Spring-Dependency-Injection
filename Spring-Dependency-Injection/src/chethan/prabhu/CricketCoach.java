package chethan.prabhu;

public class CricketCoach implements Coach{
	
	Coupon coupon;
	public CricketCoach(Coupon coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice bowling and batting";
	}
	
	public String getCouponCode() {
		return coupon.getCoupon();
	}
}
