// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateCpuOptions {
    /**
     * @return The number of CPU cores for the instance.
     * 
     */
    private final @Nullable Integer coreCount;
    /**
     * @return The number of threads per CPU core. To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
     * Otherwise, specify the default value of 2.
     * 
     */
    private final @Nullable Integer threadsPerCore;

    @CustomType.Constructor
    private LaunchTemplateCpuOptions(
        @CustomType.Parameter("coreCount") @Nullable Integer coreCount,
        @CustomType.Parameter("threadsPerCore") @Nullable Integer threadsPerCore) {
        this.coreCount = coreCount;
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * @return The number of CPU cores for the instance.
     * 
     */
    public Optional<Integer> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }
    /**
     * @return The number of threads per CPU core. To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
     * Otherwise, specify the default value of 2.
     * 
     */
    public Optional<Integer> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCpuOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coreCount;
        private @Nullable Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateCpuOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Builder threadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }        public LaunchTemplateCpuOptions build() {
            return new LaunchTemplateCpuOptions(coreCount, threadsPerCore);
        }
    }
}
