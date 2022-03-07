// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The scheduling constraints for when the profile begins.
 * 
 */
public final class RecurrentScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurrentScheduleResponse Empty = new RecurrentScheduleResponse();

    /**
     * the collection of days that the profile takes effect on. Possible values are Sunday through Saturday.
     * 
     */
    @InputImport(name="days", required=true)
      private final List<String> days;

    public List<String> getDays() {
        return this.days;
    }

    /**
     * A collection of hours that the profile takes effect on. Values supported are 0 to 23 on the 24-hour clock (AM/PM times are not supported).
     * 
     */
    @InputImport(name="hours", required=true)
      private final List<Integer> hours;

    public List<Integer> getHours() {
        return this.hours;
    }

    /**
     * A collection of minutes at which the profile takes effect at.
     * 
     */
    @InputImport(name="minutes", required=true)
      private final List<Integer> minutes;

    public List<Integer> getMinutes() {
        return this.minutes;
    }

    /**
     * the timezone for the hours of the profile. Some examples of valid time zones are: Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico), Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time, Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time, Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time, Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02, Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time, Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time, Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time
     * 
     */
    @InputImport(name="timeZone", required=true)
      private final String timeZone;

    public String getTimeZone() {
        return this.timeZone;
    }

    public RecurrentScheduleResponse(
        List<String> days,
        List<Integer> hours,
        List<Integer> minutes,
        String timeZone) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private RecurrentScheduleResponse() {
        this.days = List.of();
        this.hours = List.of();
        this.minutes = List.of();
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrentScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private List<Integer> hours;
        private List<Integer> minutes;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrentScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDays(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setHours(List<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setMinutes(List<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public RecurrentScheduleResponse build() {
            return new RecurrentScheduleResponse(days, hours, minutes, timeZone);
        }
    }
}