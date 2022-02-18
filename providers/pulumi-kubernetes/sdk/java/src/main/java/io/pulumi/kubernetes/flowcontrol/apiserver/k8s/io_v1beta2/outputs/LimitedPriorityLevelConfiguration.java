// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.LimitResponse;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LimitedPriorityLevelConfiguration {
    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    private final @Nullable Integer assuredConcurrencyShares;
    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    private final @Nullable LimitResponse limitResponse;

    @OutputCustomType.Constructor({"assuredConcurrencyShares","limitResponse"})
    private LimitedPriorityLevelConfiguration(
        @Nullable Integer assuredConcurrencyShares,
        @Nullable LimitResponse limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * 
     *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * 
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     * 
     */
    public Optional<Integer> getAssuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }
    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now
     * 
     */
    public Optional<LimitResponse> getLimitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assuredConcurrencyShares;
        private @Nullable LimitResponse limitResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitedPriorityLevelConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.limitResponse = defaults.limitResponse;
        }

        public Builder setAssuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        public Builder setLimitResponse(@Nullable LimitResponse limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }

        public LimitedPriorityLevelConfiguration build() {
            return new LimitedPriorityLevelConfiguration(assuredConcurrencyShares, limitResponse);
        }
    }
}
