// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.ReadWriteEndpointFailoverPolicy;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-write endpoint of the failover group instance.
 * 
 */
public final class FailoverGroupReadWriteEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailoverGroupReadWriteEndpointArgs Empty = new FailoverGroupReadWriteEndpointArgs();

    /**
     * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    @Import(name="failoverPolicy", required=true)
    private Output<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy;

    /**
     * @return Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    public Output<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    @Import(name="failoverWithDataLossGracePeriodMinutes")
    private @Nullable Output<Integer> failoverWithDataLossGracePeriodMinutes;

    /**
     * @return Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     */
    public Optional<Output<Integer>> failoverWithDataLossGracePeriodMinutes() {
        return Optional.ofNullable(this.failoverWithDataLossGracePeriodMinutes);
    }

    private FailoverGroupReadWriteEndpointArgs() {}

    private FailoverGroupReadWriteEndpointArgs(FailoverGroupReadWriteEndpointArgs $) {
        this.failoverPolicy = $.failoverPolicy;
        this.failoverWithDataLossGracePeriodMinutes = $.failoverWithDataLossGracePeriodMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupReadWriteEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupReadWriteEndpointArgs $;

        public Builder() {
            $ = new FailoverGroupReadWriteEndpointArgs();
        }

        public Builder(FailoverGroupReadWriteEndpointArgs defaults) {
            $ = new FailoverGroupReadWriteEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverPolicy Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(Output<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy) {
            $.failoverPolicy = failoverPolicy;
            return this;
        }

        /**
         * @param failoverPolicy Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(Either<String,ReadWriteEndpointFailoverPolicy> failoverPolicy) {
            return failoverPolicy(Output.of(failoverPolicy));
        }

        /**
         * @param failoverPolicy Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(String failoverPolicy) {
            return failoverPolicy(Either.ofLeft(failoverPolicy));
        }

        /**
         * @param failoverPolicy Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(ReadWriteEndpointFailoverPolicy failoverPolicy) {
            return failoverPolicy(Either.ofRight(failoverPolicy));
        }

        /**
         * @param failoverWithDataLossGracePeriodMinutes Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverWithDataLossGracePeriodMinutes(@Nullable Output<Integer> failoverWithDataLossGracePeriodMinutes) {
            $.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
            return this;
        }

        /**
         * @param failoverWithDataLossGracePeriodMinutes Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
         * 
         * @return builder
         * 
         */
        public Builder failoverWithDataLossGracePeriodMinutes(Integer failoverWithDataLossGracePeriodMinutes) {
            return failoverWithDataLossGracePeriodMinutes(Output.of(failoverWithDataLossGracePeriodMinutes));
        }

        public FailoverGroupReadWriteEndpointArgs build() {
            $.failoverPolicy = Objects.requireNonNull($.failoverPolicy, "expected parameter 'failoverPolicy' to be non-null");
            return $;
        }
    }

}
