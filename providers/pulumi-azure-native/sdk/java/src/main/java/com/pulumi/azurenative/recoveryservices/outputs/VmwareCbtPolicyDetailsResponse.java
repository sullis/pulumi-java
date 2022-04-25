// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VmwareCbtPolicyDetailsResponse {
    /**
     * @return The app consistent snapshot frequency in minutes.
     * 
     */
    private final @Nullable Integer appConsistentFrequencyInMinutes;
    /**
     * @return The crash consistent snapshot frequency in minutes.
     * 
     */
    private final @Nullable Integer crashConsistentFrequencyInMinutes;
    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The duration in minutes until which the recovery points need to be stored.
     * 
     */
    private final @Nullable Integer recoveryPointHistoryInMinutes;

    @CustomType.Constructor
    private VmwareCbtPolicyDetailsResponse(
        @CustomType.Parameter("appConsistentFrequencyInMinutes") @Nullable Integer appConsistentFrequencyInMinutes,
        @CustomType.Parameter("crashConsistentFrequencyInMinutes") @Nullable Integer crashConsistentFrequencyInMinutes,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("recoveryPointHistoryInMinutes") @Nullable Integer recoveryPointHistoryInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
    }

    /**
     * @return The app consistent snapshot frequency in minutes.
     * 
     */
    public Optional<Integer> appConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }
    /**
     * @return The crash consistent snapshot frequency in minutes.
     * 
     */
    public Optional<Integer> crashConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }
    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareCbt&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The duration in minutes until which the recovery points need to be stored.
     * 
     */
    public Optional<Integer> recoveryPointHistoryInMinutes() {
        return Optional.ofNullable(this.recoveryPointHistoryInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareCbtPolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private @Nullable Integer crashConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable Integer recoveryPointHistoryInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareCbtPolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.recoveryPointHistoryInMinutes = defaults.recoveryPointHistoryInMinutes;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }
        public Builder crashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder recoveryPointHistoryInMinutes(@Nullable Integer recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
            return this;
        }        public VmwareCbtPolicyDetailsResponse build() {
            return new VmwareCbtPolicyDetailsResponse(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, recoveryPointHistoryInMinutes);
        }
    }
}
