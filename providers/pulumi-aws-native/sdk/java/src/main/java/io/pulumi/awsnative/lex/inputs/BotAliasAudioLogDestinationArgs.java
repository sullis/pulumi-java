// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasS3BucketLogDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of audio log files collected when conversation logging is enabled for a bot.
 * 
 */
public final class BotAliasAudioLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasAudioLogDestinationArgs Empty = new BotAliasAudioLogDestinationArgs();

    @Import(name="s3Bucket")
      private final @Nullable Output<BotAliasS3BucketLogDestinationArgs> s3Bucket;

    public Output<BotAliasS3BucketLogDestinationArgs> s3Bucket() {
        return this.s3Bucket == null ? Codegen.empty() : this.s3Bucket;
    }

    public BotAliasAudioLogDestinationArgs(@Nullable Output<BotAliasS3BucketLogDestinationArgs> s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    private BotAliasAudioLogDestinationArgs() {
        this.s3Bucket = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BotAliasS3BucketLogDestinationArgs> s3Bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
        }

        public Builder s3Bucket(@Nullable Output<BotAliasS3BucketLogDestinationArgs> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Bucket(@Nullable BotAliasS3BucketLogDestinationArgs s3Bucket) {
            this.s3Bucket = Codegen.ofNullable(s3Bucket);
            return this;
        }        public BotAliasAudioLogDestinationArgs build() {
            return new BotAliasAudioLogDestinationArgs(s3Bucket);
        }
    }
}
