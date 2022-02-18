// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InMageRcmPolicyDetailsResponse {
    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    private final Integer appConsistentFrequencyInMinutes;
    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    private final Integer crashConsistentFrequencyInMinutes;
    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    private final String enableMultiVmSync;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    private final String instanceType;
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    private final Integer recoveryPointHistoryInMinutes;

    @OutputCustomType.Constructor({"appConsistentFrequencyInMinutes","crashConsistentFrequencyInMinutes","enableMultiVmSync","instanceType","recoveryPointHistoryInMinutes"})
    private InMageRcmPolicyDetailsResponse(
        Integer appConsistentFrequencyInMinutes,
        Integer crashConsistentFrequencyInMinutes,
        String enableMultiVmSync,
        String instanceType,
        Integer recoveryPointHistoryInMinutes) {
        this.appConsistentFrequencyInMinutes = Objects.requireNonNull(appConsistentFrequencyInMinutes);
        this.crashConsistentFrequencyInMinutes = Objects.requireNonNull(crashConsistentFrequencyInMinutes);
        this.enableMultiVmSync = Objects.requireNonNull(enableMultiVmSync);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.recoveryPointHistoryInMinutes = Objects.requireNonNull(recoveryPointHistoryInMinutes);
    }

    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    public Integer getAppConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }
    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    public Integer getCrashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }
    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    public String getEnableMultiVmSync() {
        return this.enableMultiVmSync;
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    public Integer getRecoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmPolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer appConsistentFrequencyInMinutes;
        private Integer crashConsistentFrequencyInMinutes;
        private String enableMultiVmSync;
        private String instanceType;
        private Integer recoveryPointHistoryInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmPolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.enableMultiVmSync = defaults.enableMultiVmSync;
    	      this.instanceType = defaults.instanceType;
    	      this.recoveryPointHistoryInMinutes = defaults.recoveryPointHistoryInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Objects.requireNonNull(appConsistentFrequencyInMinutes);
            return this;
        }

        public Builder setCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = Objects.requireNonNull(crashConsistentFrequencyInMinutes);
            return this;
        }

        public Builder setEnableMultiVmSync(String enableMultiVmSync) {
            this.enableMultiVmSync = Objects.requireNonNull(enableMultiVmSync);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setRecoveryPointHistoryInMinutes(Integer recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = Objects.requireNonNull(recoveryPointHistoryInMinutes);
            return this;
        }

        public InMageRcmPolicyDetailsResponse build() {
            return new InMageRcmPolicyDetailsResponse(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, enableMultiVmSync, instanceType, recoveryPointHistoryInMinutes);
        }
    }
}
