// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement_v1.outputs.DeleteServiceStrategyResponse;
import com.pulumi.googlenative.servicemanagement_v1.outputs.TrafficPercentStrategyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRolloutResult {
    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    private final String createTime;
    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    private final DeleteServiceStrategyResponse deleteServiceStrategy;
    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    private final String rolloutId;
    /**
     * @return The name of the service associated with this Rollout.
     * 
     */
    private final String serviceName;
    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    private final String status;
    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    private final TrafficPercentStrategyResponse trafficPercentStrategy;

    @CustomType.Constructor
    private GetRolloutResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteServiceStrategy") DeleteServiceStrategyResponse deleteServiceStrategy,
        @CustomType.Parameter("rolloutId") String rolloutId,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("trafficPercentStrategy") TrafficPercentStrategyResponse trafficPercentStrategy) {
        this.createTime = createTime;
        this.deleteServiceStrategy = deleteServiceStrategy;
        this.rolloutId = rolloutId;
        this.serviceName = serviceName;
        this.status = status;
        this.trafficPercentStrategy = trafficPercentStrategy;
    }

    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    public DeleteServiceStrategyResponse deleteServiceStrategy() {
        return this.deleteServiceStrategy;
    }
    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    public String rolloutId() {
        return this.rolloutId;
    }
    /**
     * @return The name of the service associated with this Rollout.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    public TrafficPercentStrategyResponse trafficPercentStrategy() {
        return this.trafficPercentStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolloutResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DeleteServiceStrategyResponse deleteServiceStrategy;
        private String rolloutId;
        private String serviceName;
        private String status;
        private TrafficPercentStrategyResponse trafficPercentStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolloutResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteServiceStrategy = defaults.deleteServiceStrategy;
    	      this.rolloutId = defaults.rolloutId;
    	      this.serviceName = defaults.serviceName;
    	      this.status = defaults.status;
    	      this.trafficPercentStrategy = defaults.trafficPercentStrategy;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteServiceStrategy(DeleteServiceStrategyResponse deleteServiceStrategy) {
            this.deleteServiceStrategy = Objects.requireNonNull(deleteServiceStrategy);
            return this;
        }
        public Builder rolloutId(String rolloutId) {
            this.rolloutId = Objects.requireNonNull(rolloutId);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder trafficPercentStrategy(TrafficPercentStrategyResponse trafficPercentStrategy) {
            this.trafficPercentStrategy = Objects.requireNonNull(trafficPercentStrategy);
            return this;
        }        public GetRolloutResult build() {
            return new GetRolloutResult(createTime, deleteServiceStrategy, rolloutId, serviceName, status, trafficPercentStrategy);
        }
    }
}
