// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.UserProfileSharingSettingsNotebookOutputOption;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileSharingSettings {
    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
     * 
     */
    private final @Nullable UserProfileSharingSettingsNotebookOutputOption notebookOutputOption;
    /**
     * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    private final @Nullable String s3KmsKeyId;
    /**
     * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
     * 
     */
    private final @Nullable String s3OutputPath;

    @CustomType.Constructor
    private UserProfileSharingSettings(
        @CustomType.Parameter("notebookOutputOption") @Nullable UserProfileSharingSettingsNotebookOutputOption notebookOutputOption,
        @CustomType.Parameter("s3KmsKeyId") @Nullable String s3KmsKeyId,
        @CustomType.Parameter("s3OutputPath") @Nullable String s3OutputPath) {
        this.notebookOutputOption = notebookOutputOption;
        this.s3KmsKeyId = s3KmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
     * 
    */
    public Optional<UserProfileSharingSettingsNotebookOutputOption> notebookOutputOption() {
        return Optional.ofNullable(this.notebookOutputOption);
    }
    /**
     * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
    */
    public Optional<String> s3KmsKeyId() {
        return Optional.ofNullable(this.s3KmsKeyId);
    }
    /**
     * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
     * 
    */
    public Optional<String> s3OutputPath() {
        return Optional.ofNullable(this.s3OutputPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileSharingSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserProfileSharingSettingsNotebookOutputOption notebookOutputOption;
        private @Nullable String s3KmsKeyId;
        private @Nullable String s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileSharingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notebookOutputOption = defaults.notebookOutputOption;
    	      this.s3KmsKeyId = defaults.s3KmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder notebookOutputOption(@Nullable UserProfileSharingSettingsNotebookOutputOption notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }
        public Builder s3KmsKeyId(@Nullable String s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }
        public Builder s3OutputPath(@Nullable String s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }        public UserProfileSharingSettings build() {
            return new UserProfileSharingSettings(notebookOutputOption, s3KmsKeyId, s3OutputPath);
        }
    }
}
