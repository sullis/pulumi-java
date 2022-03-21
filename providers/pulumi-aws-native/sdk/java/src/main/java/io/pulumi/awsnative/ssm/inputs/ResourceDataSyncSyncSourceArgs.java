// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncAwsOrganizationsSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceDataSyncSyncSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncSyncSourceArgs Empty = new ResourceDataSyncSyncSourceArgs();

    @Import(name="awsOrganizationsSource")
      private final @Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource;

    public Output<ResourceDataSyncAwsOrganizationsSourceArgs> getAwsOrganizationsSource() {
        return this.awsOrganizationsSource == null ? Output.empty() : this.awsOrganizationsSource;
    }

    @Import(name="includeFutureRegions")
      private final @Nullable Output<Boolean> includeFutureRegions;

    public Output<Boolean> getIncludeFutureRegions() {
        return this.includeFutureRegions == null ? Output.empty() : this.includeFutureRegions;
    }

    @Import(name="sourceRegions", required=true)
      private final Output<List<String>> sourceRegions;

    public Output<List<String>> getSourceRegions() {
        return this.sourceRegions;
    }

    @Import(name="sourceType", required=true)
      private final Output<String> sourceType;

    public Output<String> getSourceType() {
        return this.sourceType;
    }

    public ResourceDataSyncSyncSourceArgs(
        @Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource,
        @Nullable Output<Boolean> includeFutureRegions,
        Output<List<String>> sourceRegions,
        Output<String> sourceType) {
        this.awsOrganizationsSource = awsOrganizationsSource;
        this.includeFutureRegions = includeFutureRegions;
        this.sourceRegions = Objects.requireNonNull(sourceRegions, "expected parameter 'sourceRegions' to be non-null");
        this.sourceType = Objects.requireNonNull(sourceType, "expected parameter 'sourceType' to be non-null");
    }

    private ResourceDataSyncSyncSourceArgs() {
        this.awsOrganizationsSource = Output.empty();
        this.includeFutureRegions = Output.empty();
        this.sourceRegions = Output.empty();
        this.sourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncSyncSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource;
        private @Nullable Output<Boolean> includeFutureRegions;
        private Output<List<String>> sourceRegions;
        private Output<String> sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncSyncSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsOrganizationsSource = defaults.awsOrganizationsSource;
    	      this.includeFutureRegions = defaults.includeFutureRegions;
    	      this.sourceRegions = defaults.sourceRegions;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder awsOrganizationsSource(@Nullable Output<ResourceDataSyncAwsOrganizationsSourceArgs> awsOrganizationsSource) {
            this.awsOrganizationsSource = awsOrganizationsSource;
            return this;
        }
        public Builder awsOrganizationsSource(@Nullable ResourceDataSyncAwsOrganizationsSourceArgs awsOrganizationsSource) {
            this.awsOrganizationsSource = Output.ofNullable(awsOrganizationsSource);
            return this;
        }
        public Builder includeFutureRegions(@Nullable Output<Boolean> includeFutureRegions) {
            this.includeFutureRegions = includeFutureRegions;
            return this;
        }
        public Builder includeFutureRegions(@Nullable Boolean includeFutureRegions) {
            this.includeFutureRegions = Output.ofNullable(includeFutureRegions);
            return this;
        }
        public Builder sourceRegions(Output<List<String>> sourceRegions) {
            this.sourceRegions = Objects.requireNonNull(sourceRegions);
            return this;
        }
        public Builder sourceRegions(List<String> sourceRegions) {
            this.sourceRegions = Output.of(Objects.requireNonNull(sourceRegions));
            return this;
        }
        public Builder sourceRegions(String... sourceRegions) {
            return sourceRegions(List.of(sourceRegions));
        }
        public Builder sourceType(Output<String> sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Output.of(Objects.requireNonNull(sourceType));
            return this;
        }        public ResourceDataSyncSyncSourceArgs build() {
            return new ResourceDataSyncSyncSourceArgs(awsOrganizationsSource, includeFutureRegions, sourceRegions, sourceType);
        }
    }
}
