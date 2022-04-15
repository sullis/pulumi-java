// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.StorageLensAccountLevelArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensAwsOrgArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensBucketsAndRegionsArgs;
import io.pulumi.awsnative.s3.inputs.StorageLensDataExportArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the details of Amazon S3 Storage Lens configuration.
 * 
 */
public final class StorageLensConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensConfigurationArgs Empty = new StorageLensConfigurationArgs();

    @Import(name="accountLevel", required=true)
      private final Output<StorageLensAccountLevelArgs> accountLevel;

    public Output<StorageLensAccountLevelArgs> accountLevel() {
        return this.accountLevel;
    }

    @Import(name="awsOrg")
      private final @Nullable Output<StorageLensAwsOrgArgs> awsOrg;

    public Output<StorageLensAwsOrgArgs> awsOrg() {
        return this.awsOrg == null ? Codegen.empty() : this.awsOrg;
    }

    @Import(name="dataExport")
      private final @Nullable Output<StorageLensDataExportArgs> dataExport;

    public Output<StorageLensDataExportArgs> dataExport() {
        return this.dataExport == null ? Codegen.empty() : this.dataExport;
    }

    @Import(name="exclude")
      private final @Nullable Output<StorageLensBucketsAndRegionsArgs> exclude;

    public Output<StorageLensBucketsAndRegionsArgs> exclude() {
        return this.exclude == null ? Codegen.empty() : this.exclude;
    }

    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="include")
      private final @Nullable Output<StorageLensBucketsAndRegionsArgs> include;

    public Output<StorageLensBucketsAndRegionsArgs> include() {
        return this.include == null ? Codegen.empty() : this.include;
    }

    /**
     * Specifies whether the Amazon S3 Storage Lens configuration is enabled or disabled.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The ARN for the Amazon S3 Storage Lens configuration.
     * 
     */
    @Import(name="storageLensArn")
      private final @Nullable Output<String> storageLensArn;

    public Output<String> storageLensArn() {
        return this.storageLensArn == null ? Codegen.empty() : this.storageLensArn;
    }

    public StorageLensConfigurationArgs(
        Output<StorageLensAccountLevelArgs> accountLevel,
        @Nullable Output<StorageLensAwsOrgArgs> awsOrg,
        @Nullable Output<StorageLensDataExportArgs> dataExport,
        @Nullable Output<StorageLensBucketsAndRegionsArgs> exclude,
        Output<String> id,
        @Nullable Output<StorageLensBucketsAndRegionsArgs> include,
        Output<Boolean> isEnabled,
        @Nullable Output<String> storageLensArn) {
        this.accountLevel = Objects.requireNonNull(accountLevel, "expected parameter 'accountLevel' to be non-null");
        this.awsOrg = awsOrg;
        this.dataExport = dataExport;
        this.exclude = exclude;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.include = include;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.storageLensArn = storageLensArn;
    }

    private StorageLensConfigurationArgs() {
        this.accountLevel = Codegen.empty();
        this.awsOrg = Codegen.empty();
        this.dataExport = Codegen.empty();
        this.exclude = Codegen.empty();
        this.id = Codegen.empty();
        this.include = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.storageLensArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<StorageLensAccountLevelArgs> accountLevel;
        private @Nullable Output<StorageLensAwsOrgArgs> awsOrg;
        private @Nullable Output<StorageLensDataExportArgs> dataExport;
        private @Nullable Output<StorageLensBucketsAndRegionsArgs> exclude;
        private Output<String> id;
        private @Nullable Output<StorageLensBucketsAndRegionsArgs> include;
        private Output<Boolean> isEnabled;
        private @Nullable Output<String> storageLensArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLevel = defaults.accountLevel;
    	      this.awsOrg = defaults.awsOrg;
    	      this.dataExport = defaults.dataExport;
    	      this.exclude = defaults.exclude;
    	      this.id = defaults.id;
    	      this.include = defaults.include;
    	      this.isEnabled = defaults.isEnabled;
    	      this.storageLensArn = defaults.storageLensArn;
        }

        public Builder accountLevel(Output<StorageLensAccountLevelArgs> accountLevel) {
            this.accountLevel = Objects.requireNonNull(accountLevel);
            return this;
        }
        public Builder accountLevel(StorageLensAccountLevelArgs accountLevel) {
            this.accountLevel = Output.of(Objects.requireNonNull(accountLevel));
            return this;
        }
        public Builder awsOrg(@Nullable Output<StorageLensAwsOrgArgs> awsOrg) {
            this.awsOrg = awsOrg;
            return this;
        }
        public Builder awsOrg(@Nullable StorageLensAwsOrgArgs awsOrg) {
            this.awsOrg = Codegen.ofNullable(awsOrg);
            return this;
        }
        public Builder dataExport(@Nullable Output<StorageLensDataExportArgs> dataExport) {
            this.dataExport = dataExport;
            return this;
        }
        public Builder dataExport(@Nullable StorageLensDataExportArgs dataExport) {
            this.dataExport = Codegen.ofNullable(dataExport);
            return this;
        }
        public Builder exclude(@Nullable Output<StorageLensBucketsAndRegionsArgs> exclude) {
            this.exclude = exclude;
            return this;
        }
        public Builder exclude(@Nullable StorageLensBucketsAndRegionsArgs exclude) {
            this.exclude = Codegen.ofNullable(exclude);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder include(@Nullable Output<StorageLensBucketsAndRegionsArgs> include) {
            this.include = include;
            return this;
        }
        public Builder include(@Nullable StorageLensBucketsAndRegionsArgs include) {
            this.include = Codegen.ofNullable(include);
            return this;
        }
        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public Builder storageLensArn(@Nullable Output<String> storageLensArn) {
            this.storageLensArn = storageLensArn;
            return this;
        }
        public Builder storageLensArn(@Nullable String storageLensArn) {
            this.storageLensArn = Codegen.ofNullable(storageLensArn);
            return this;
        }        public StorageLensConfigurationArgs build() {
            return new StorageLensConfigurationArgs(accountLevel, awsOrg, dataExport, exclude, id, include, isEnabled, storageLensArn);
        }
    }
}
