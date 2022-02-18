// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobLoadDestinationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobLoadDestinationEncryptionConfigurationArgs Empty = new JobLoadDestinationEncryptionConfigurationArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
    private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
     */
    @InputImport(name="kmsKeyVersion")
    private final @Nullable Input<String> kmsKeyVersion;

    public Input<String> getKmsKeyVersion() {
        return this.kmsKeyVersion == null ? Input.empty() : this.kmsKeyVersion;
    }

    public JobLoadDestinationEncryptionConfigurationArgs(
        Input<String> kmsKeyName,
        @Nullable Input<String> kmsKeyVersion) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.kmsKeyVersion = kmsKeyVersion;
    }

    private JobLoadDestinationEncryptionConfigurationArgs() {
        this.kmsKeyName = Input.empty();
        this.kmsKeyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadDestinationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;
        private @Nullable Input<String> kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadDestinationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder setKmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }

        public Builder setKmsKeyVersion(@Nullable Input<String> kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }

        public Builder setKmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = Input.ofNullable(kmsKeyVersion);
            return this;
        }

        public JobLoadDestinationEncryptionConfigurationArgs build() {
            return new JobLoadDestinationEncryptionConfigurationArgs(kmsKeyName, kmsKeyVersion);
        }
    }
}
