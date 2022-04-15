// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * Amazon Resource Name (ARN) identifying your CloudFront Function.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Source code of the function
     * 
     */
    @Import(name="code")
      private final @Nullable Output<String> code;

    public Output<String> code() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * Comment.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * ETag hash of the function. This is the value for the `DEVELOPMENT` stage of the function.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * ETag hash of any `LIVE` stage of the function.
     * 
     */
    @Import(name="liveStageEtag")
      private final @Nullable Output<String> liveStageEtag;

    public Output<String> liveStageEtag() {
        return this.liveStageEtag == null ? Codegen.empty() : this.liveStageEtag;
    }

    /**
     * Unique name for your CloudFront Function.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Whether to publish creation/change as Live CloudFront Function Version. Defaults to `true`.
     * 
     */
    @Import(name="publish")
      private final @Nullable Output<Boolean> publish;

    public Output<Boolean> publish() {
        return this.publish == null ? Codegen.empty() : this.publish;
    }

    /**
     * Identifier of the function's runtime. Currently only `cloudfront-js-1.0` is valid.
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<String> runtime;

    public Output<String> runtime() {
        return this.runtime == null ? Codegen.empty() : this.runtime;
    }

    /**
     * Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public FunctionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> code,
        @Nullable Output<String> comment,
        @Nullable Output<String> etag,
        @Nullable Output<String> liveStageEtag,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> publish,
        @Nullable Output<String> runtime,
        @Nullable Output<String> status) {
        this.arn = arn;
        this.code = code;
        this.comment = comment;
        this.etag = etag;
        this.liveStageEtag = liveStageEtag;
        this.name = name;
        this.publish = publish;
        this.runtime = runtime;
        this.status = status;
    }

    private FunctionState() {
        this.arn = Codegen.empty();
        this.code = Codegen.empty();
        this.comment = Codegen.empty();
        this.etag = Codegen.empty();
        this.liveStageEtag = Codegen.empty();
        this.name = Codegen.empty();
        this.publish = Codegen.empty();
        this.runtime = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> code;
        private @Nullable Output<String> comment;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> liveStageEtag;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> publish;
        private @Nullable Output<String> runtime;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.liveStageEtag = defaults.liveStageEtag;
    	      this.name = defaults.name;
    	      this.publish = defaults.publish;
    	      this.runtime = defaults.runtime;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder code(@Nullable Output<String> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable String code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder liveStageEtag(@Nullable Output<String> liveStageEtag) {
            this.liveStageEtag = liveStageEtag;
            return this;
        }
        public Builder liveStageEtag(@Nullable String liveStageEtag) {
            this.liveStageEtag = Codegen.ofNullable(liveStageEtag);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder publish(@Nullable Output<Boolean> publish) {
            this.publish = publish;
            return this;
        }
        public Builder publish(@Nullable Boolean publish) {
            this.publish = Codegen.ofNullable(publish);
            return this;
        }
        public Builder runtime(@Nullable Output<String> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = Codegen.ofNullable(runtime);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public FunctionState build() {
            return new FunctionState(arn, code, comment, etag, liveStageEtag, name, publish, runtime, status);
        }
    }
}
