// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasS3BucketLogDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of audio log files collected when conversation logging is enabled for a bot.
 * 
 */
public final class BotAliasAudioLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasAudioLogDestinationArgs Empty = new BotAliasAudioLogDestinationArgs();

    @InputImport(name="s3Bucket")
    private final @Nullable Input<BotAliasS3BucketLogDestinationArgs> s3Bucket;

    public Input<BotAliasS3BucketLogDestinationArgs> getS3Bucket() {
        return this.s3Bucket == null ? Input.empty() : this.s3Bucket;
    }

    public BotAliasAudioLogDestinationArgs(@Nullable Input<BotAliasS3BucketLogDestinationArgs> s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    private BotAliasAudioLogDestinationArgs() {
        this.s3Bucket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotAliasS3BucketLogDestinationArgs> s3Bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
        }

        public Builder setS3Bucket(@Nullable Input<BotAliasS3BucketLogDestinationArgs> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder setS3Bucket(@Nullable BotAliasS3BucketLogDestinationArgs s3Bucket) {
            this.s3Bucket = Input.ofNullable(s3Bucket);
            return this;
        }

        public BotAliasAudioLogDestinationArgs build() {
            return new BotAliasAudioLogDestinationArgs(s3Bucket);
        }
    }
}
