// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotGrammarSlotTypeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotGrammarSlotTypeSourceArgs Empty = new BotGrammarSlotTypeSourceArgs();

    @InputImport(name="kmsKeyArn")
    private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    @InputImport(name="s3BucketName", required=true)
    private final Input<String> s3BucketName;

    public Input<String> getS3BucketName() {
        return this.s3BucketName;
    }

    @InputImport(name="s3ObjectKey", required=true)
    private final Input<String> s3ObjectKey;

    public Input<String> getS3ObjectKey() {
        return this.s3ObjectKey;
    }

    public BotGrammarSlotTypeSourceArgs(
        @Nullable Input<String> kmsKeyArn,
        Input<String> s3BucketName,
        Input<String> s3ObjectKey) {
        this.kmsKeyArn = kmsKeyArn;
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey, "expected parameter 's3ObjectKey' to be non-null");
    }

    private BotGrammarSlotTypeSourceArgs() {
        this.kmsKeyArn = Input.empty();
        this.s3BucketName = Input.empty();
        this.s3ObjectKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotGrammarSlotTypeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyArn;
        private Input<String> s3BucketName;
        private Input<String> s3ObjectKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BotGrammarSlotTypeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectKey = defaults.s3ObjectKey;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setS3BucketName(Input<String> s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Input.of(Objects.requireNonNull(s3BucketName));
            return this;
        }

        public Builder setS3ObjectKey(Input<String> s3ObjectKey) {
            this.s3ObjectKey = Objects.requireNonNull(s3ObjectKey);
            return this;
        }

        public Builder setS3ObjectKey(String s3ObjectKey) {
            this.s3ObjectKey = Input.of(Objects.requireNonNull(s3ObjectKey));
            return this;
        }

        public BotGrammarSlotTypeSourceArgs build() {
            return new BotGrammarSlotTypeSourceArgs(kmsKeyArn, s3BucketName, s3ObjectKey);
        }
    }
}
