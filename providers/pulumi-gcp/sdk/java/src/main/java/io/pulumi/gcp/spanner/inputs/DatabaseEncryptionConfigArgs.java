// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatabaseEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionConfigArgs Empty = new DatabaseEncryptionConfigArgs();

    /**
     * Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
    private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public DatabaseEncryptionConfigArgs(Input<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private DatabaseEncryptionConfigArgs() {
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }

        public DatabaseEncryptionConfigArgs build() {
            return new DatabaseEncryptionConfigArgs(kmsKeyName);
        }
    }
}
