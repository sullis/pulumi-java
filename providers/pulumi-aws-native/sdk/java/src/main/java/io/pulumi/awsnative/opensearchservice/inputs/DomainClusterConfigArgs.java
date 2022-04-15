// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.awsnative.opensearchservice.inputs.DomainZoneAwarenessConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainClusterConfigArgs Empty = new DomainClusterConfigArgs();

    @Import(name="dedicatedMasterCount")
      private final @Nullable Output<Integer> dedicatedMasterCount;

    public Output<Integer> dedicatedMasterCount() {
        return this.dedicatedMasterCount == null ? Codegen.empty() : this.dedicatedMasterCount;
    }

    @Import(name="dedicatedMasterEnabled")
      private final @Nullable Output<Boolean> dedicatedMasterEnabled;

    public Output<Boolean> dedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled == null ? Codegen.empty() : this.dedicatedMasterEnabled;
    }

    @Import(name="dedicatedMasterType")
      private final @Nullable Output<String> dedicatedMasterType;

    public Output<String> dedicatedMasterType() {
        return this.dedicatedMasterType == null ? Codegen.empty() : this.dedicatedMasterType;
    }

    @Import(name="instanceCount")
      private final @Nullable Output<Integer> instanceCount;

    public Output<Integer> instanceCount() {
        return this.instanceCount == null ? Codegen.empty() : this.instanceCount;
    }

    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    @Import(name="warmCount")
      private final @Nullable Output<Integer> warmCount;

    public Output<Integer> warmCount() {
        return this.warmCount == null ? Codegen.empty() : this.warmCount;
    }

    @Import(name="warmEnabled")
      private final @Nullable Output<Boolean> warmEnabled;

    public Output<Boolean> warmEnabled() {
        return this.warmEnabled == null ? Codegen.empty() : this.warmEnabled;
    }

    @Import(name="warmType")
      private final @Nullable Output<String> warmType;

    public Output<String> warmType() {
        return this.warmType == null ? Codegen.empty() : this.warmType;
    }

    @Import(name="zoneAwarenessConfig")
      private final @Nullable Output<DomainZoneAwarenessConfigArgs> zoneAwarenessConfig;

    public Output<DomainZoneAwarenessConfigArgs> zoneAwarenessConfig() {
        return this.zoneAwarenessConfig == null ? Codegen.empty() : this.zoneAwarenessConfig;
    }

    @Import(name="zoneAwarenessEnabled")
      private final @Nullable Output<Boolean> zoneAwarenessEnabled;

    public Output<Boolean> zoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled == null ? Codegen.empty() : this.zoneAwarenessEnabled;
    }

    public DomainClusterConfigArgs(
        @Nullable Output<Integer> dedicatedMasterCount,
        @Nullable Output<Boolean> dedicatedMasterEnabled,
        @Nullable Output<String> dedicatedMasterType,
        @Nullable Output<Integer> instanceCount,
        @Nullable Output<String> instanceType,
        @Nullable Output<Integer> warmCount,
        @Nullable Output<Boolean> warmEnabled,
        @Nullable Output<String> warmType,
        @Nullable Output<DomainZoneAwarenessConfigArgs> zoneAwarenessConfig,
        @Nullable Output<Boolean> zoneAwarenessEnabled) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    private DomainClusterConfigArgs() {
        this.dedicatedMasterCount = Codegen.empty();
        this.dedicatedMasterEnabled = Codegen.empty();
        this.dedicatedMasterType = Codegen.empty();
        this.instanceCount = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.warmCount = Codegen.empty();
        this.warmEnabled = Codegen.empty();
        this.warmType = Codegen.empty();
        this.zoneAwarenessConfig = Codegen.empty();
        this.zoneAwarenessEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> dedicatedMasterCount;
        private @Nullable Output<Boolean> dedicatedMasterEnabled;
        private @Nullable Output<String> dedicatedMasterType;
        private @Nullable Output<Integer> instanceCount;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Integer> warmCount;
        private @Nullable Output<Boolean> warmEnabled;
        private @Nullable Output<String> warmType;
        private @Nullable Output<DomainZoneAwarenessConfigArgs> zoneAwarenessConfig;
        private @Nullable Output<Boolean> zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder dedicatedMasterCount(@Nullable Output<Integer> dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }
        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Codegen.ofNullable(dedicatedMasterCount);
            return this;
        }
        public Builder dedicatedMasterEnabled(@Nullable Output<Boolean> dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }
        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Codegen.ofNullable(dedicatedMasterEnabled);
            return this;
        }
        public Builder dedicatedMasterType(@Nullable Output<String> dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }
        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = Codegen.ofNullable(dedicatedMasterType);
            return this;
        }
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Codegen.ofNullable(instanceCount);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder warmCount(@Nullable Output<Integer> warmCount) {
            this.warmCount = warmCount;
            return this;
        }
        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = Codegen.ofNullable(warmCount);
            return this;
        }
        public Builder warmEnabled(@Nullable Output<Boolean> warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = Codegen.ofNullable(warmEnabled);
            return this;
        }
        public Builder warmType(@Nullable Output<String> warmType) {
            this.warmType = warmType;
            return this;
        }
        public Builder warmType(@Nullable String warmType) {
            this.warmType = Codegen.ofNullable(warmType);
            return this;
        }
        public Builder zoneAwarenessConfig(@Nullable Output<DomainZoneAwarenessConfigArgs> zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }
        public Builder zoneAwarenessConfig(@Nullable DomainZoneAwarenessConfigArgs zoneAwarenessConfig) {
            this.zoneAwarenessConfig = Codegen.ofNullable(zoneAwarenessConfig);
            return this;
        }
        public Builder zoneAwarenessEnabled(@Nullable Output<Boolean> zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }
        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Codegen.ofNullable(zoneAwarenessEnabled);
            return this;
        }        public DomainClusterConfigArgs build() {
            return new DomainClusterConfigArgs(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }
}
