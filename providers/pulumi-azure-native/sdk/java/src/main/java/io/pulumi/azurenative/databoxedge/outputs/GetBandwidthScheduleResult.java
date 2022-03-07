// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBandwidthScheduleResult {
    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    private final List<String> days;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * The bandwidth rate in Mbps.
     * 
     */
    private final Integer rateInMbps;
    /**
     * The start time of the schedule in UTC.
     * 
     */
    private final String start;
    /**
     * The stop time of the schedule in UTC.
     * 
     */
    private final String stop;
    /**
     * Bandwidth object related to ASE resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"days","id","name","rateInMbps","start","stop","systemData","type"})
    private GetBandwidthScheduleResult(
        List<String> days,
        String id,
        String name,
        Integer rateInMbps,
        String start,
        String stop,
        SystemDataResponse systemData,
        String type) {
        this.days = Objects.requireNonNull(days);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.rateInMbps = Objects.requireNonNull(rateInMbps);
        this.start = Objects.requireNonNull(start);
        this.stop = Objects.requireNonNull(stop);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The days of the week when this schedule is applicable.
     * 
    */
    public List<String> getDays() {
        return this.days;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The bandwidth rate in Mbps.
     * 
    */
    public Integer getRateInMbps() {
        return this.rateInMbps;
    }
    /**
     * The start time of the schedule in UTC.
     * 
    */
    public String getStart() {
        return this.start;
    }
    /**
     * The stop time of the schedule in UTC.
     * 
    */
    public String getStop() {
        return this.stop;
    }
    /**
     * Bandwidth object related to ASE resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBandwidthScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private String id;
        private String name;
        private Integer rateInMbps;
        private String start;
        private String stop;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBandwidthScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDays(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRateInMbps(Integer rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStop(String stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBandwidthScheduleResult build() {
            return new GetBandwidthScheduleResult(days, id, name, rateInMbps, start, stop, systemData, type);
        }
    }
}