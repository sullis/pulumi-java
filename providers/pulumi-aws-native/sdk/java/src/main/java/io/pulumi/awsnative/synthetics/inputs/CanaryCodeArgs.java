// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryCodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryCodeArgs Empty = new CanaryCodeArgs();

    @Import(name="handler", required=true)
      private final Output<String> handler;

    public Output<String> handler() {
        return this.handler;
    }

    @Import(name="s3Bucket")
      private final @Nullable Output<String> s3Bucket;

    public Output<String> s3Bucket() {
        return this.s3Bucket == null ? Codegen.empty() : this.s3Bucket;
    }

    @Import(name="s3Key")
      private final @Nullable Output<String> s3Key;

    public Output<String> s3Key() {
        return this.s3Key == null ? Codegen.empty() : this.s3Key;
    }

    @Import(name="s3ObjectVersion")
      private final @Nullable Output<String> s3ObjectVersion;

    public Output<String> s3ObjectVersion() {
        return this.s3ObjectVersion == null ? Codegen.empty() : this.s3ObjectVersion;
    }

    @Import(name="script")
      private final @Nullable Output<String> script;

    public Output<String> script() {
        return this.script == null ? Codegen.empty() : this.script;
    }

    public CanaryCodeArgs(
        Output<String> handler,
        @Nullable Output<String> s3Bucket,
        @Nullable Output<String> s3Key,
        @Nullable Output<String> s3ObjectVersion,
        @Nullable Output<String> script) {
        this.handler = Objects.requireNonNull(handler, "expected parameter 'handler' to be non-null");
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.script = script;
    }

    private CanaryCodeArgs() {
        this.handler = Codegen.empty();
        this.s3Bucket = Codegen.empty();
        this.s3Key = Codegen.empty();
        this.s3ObjectVersion = Codegen.empty();
        this.script = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> handler;
        private @Nullable Output<String> s3Bucket;
        private @Nullable Output<String> s3Key;
        private @Nullable Output<String> s3ObjectVersion;
        private @Nullable Output<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryCodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.handler = defaults.handler;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.script = defaults.script;
        }

        public Builder handler(Output<String> handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }
        public Builder handler(String handler) {
            this.handler = Output.of(Objects.requireNonNull(handler));
            return this;
        }
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Codegen.ofNullable(s3Bucket);
            return this;
        }
        public Builder s3Key(@Nullable Output<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }
        public Builder s3Key(@Nullable String s3Key) {
            this.s3Key = Codegen.ofNullable(s3Key);
            return this;
        }
        public Builder s3ObjectVersion(@Nullable Output<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }
        public Builder s3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Codegen.ofNullable(s3ObjectVersion);
            return this;
        }
        public Builder script(@Nullable Output<String> script) {
            this.script = script;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = Codegen.ofNullable(script);
            return this;
        }        public CanaryCodeArgs build() {
            return new CanaryCodeArgs(handler, s3Bucket, s3Key, s3ObjectVersion, script);
        }
    }
}
