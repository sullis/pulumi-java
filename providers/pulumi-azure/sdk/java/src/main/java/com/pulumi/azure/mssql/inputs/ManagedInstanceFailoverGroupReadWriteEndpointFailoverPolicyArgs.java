// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs Empty = new ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs();

    /**
     * Applies only if `mode` is `Automatic`. The grace period in minutes before failover with data loss is attempted.
     * 
     */
    @Import(name="graceMinutes")
    private @Nullable Output<Integer> graceMinutes;

    /**
     * @return Applies only if `mode` is `Automatic`. The grace period in minutes before failover with data loss is attempted.
     * 
     */
    public Optional<Output<Integer>> graceMinutes() {
        return Optional.ofNullable(this.graceMinutes);
    }

    /**
     * The failover mode. Possible values are `Automatic` or `Manual`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The failover mode. Possible values are `Automatic` or `Manual`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs() {}

    private ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs(ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs $) {
        this.graceMinutes = $.graceMinutes;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs $;

        public Builder() {
            $ = new ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs();
        }

        public Builder(ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs defaults) {
            $ = new ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param graceMinutes Applies only if `mode` is `Automatic`. The grace period in minutes before failover with data loss is attempted.
         * 
         * @return builder
         * 
         */
        public Builder graceMinutes(@Nullable Output<Integer> graceMinutes) {
            $.graceMinutes = graceMinutes;
            return this;
        }

        /**
         * @param graceMinutes Applies only if `mode` is `Automatic`. The grace period in minutes before failover with data loss is attempted.
         * 
         * @return builder
         * 
         */
        public Builder graceMinutes(Integer graceMinutes) {
            return graceMinutes(Output.of(graceMinutes));
        }

        /**
         * @param mode The failover mode. Possible values are `Automatic` or `Manual`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The failover mode. Possible values are `Automatic` or `Manual`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
