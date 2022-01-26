/**
 * @param report
 */
case class TelraamSchema (
     report: List[Report]
)

object IntervalEnum extends Enumeration {
    val hourly, daily = Value
}

/**
 * @param instance_id
 * @param segment_id
 * @param date
 * @param interval
 * @param uptime
 * @param timezone
 * @param pedestrian
 * @param bike
 * @param car
 * @param heavy
 * @param pedestrian_lft
 * @param bike_lft
 * @param car_lft
 * @param heavy_lft
 * @param pedestrian_rgt
 * @param bike_rgt
 * @param car_rgt
 * @param heavy_rgt
 * @param direction
 * @param car_speed_hist_0to70plus
 * @param car_speed_hist_0to120plus
 * @param v85
 */
case class Report (
     instance_id: Option[Int],
     segment_id: Int,
     date: String,
     interval: IntervalEnum.Value,
     uptime: Double,
     timezone: String,
     pedestrian: Double,
     bike: Double,
     car: Double,
     heavy: Double,
     pedestrian_lft: Double,
     bike_lft: Double,
     car_lft: Double,
     heavy_lft: Double,
     pedestrian_rgt: Double,
     bike_rgt: Double,
     car_rgt: Double,
     heavy_rgt: Double,
     direction: Int,
     car_speed_hist_0to70plus: List[Double],
     car_speed_hist_0to120plus: List[Double],
     v85: Double
)