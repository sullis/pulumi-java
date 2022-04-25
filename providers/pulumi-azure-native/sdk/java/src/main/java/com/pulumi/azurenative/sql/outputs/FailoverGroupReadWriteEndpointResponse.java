// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverGroupReadWriteEndpointResponse {
    /**
     * @return Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    private final String failoverPolicy;
    /**
     * @return Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    private final @Nullable Integer failoverWithDataLossGracePeriodMinutes;

    @CustomType.Constructor
    private FailoverGroupReadWriteEndpointResponse(
        @CustomType.Parameter("failoverPolicy") String failoverPolicy,
        @CustomType.Parameter("failoverWithDataLossGracePeriodMinutes") @Nullable Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverPolicy = failoverPolicy;
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
    }

    /**
     * @return Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    public String failoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * @return Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    public Optional<Integer> failoverWithDataLossGracePeriodMinutes() {
        return Optional.ofNullable(this.failoverWithDataLossGracePeriodMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReadWriteEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failoverPolicy;
        private @Nullable Integer failoverWithDataLossGracePeriodMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupReadWriteEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.failoverWithDataLossGracePeriodMinutes = defaults.failoverWithDataLossGracePeriodMinutes;
        }

        public Builder failoverPolicy(String failoverPolicy) {
            this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
            return this;
        }
        public Builder failoverWithDataLossGracePeriodMinutes(@Nullable Integer failoverWithDataLossGracePeriodMinutes) {
            this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
            return this;
        }        public FailoverGroupReadWriteEndpointResponse build() {
            return new FailoverGroupReadWriteEndpointResponse(failoverPolicy, failoverWithDataLossGracePeriodMinutes);
        }
    }
}
