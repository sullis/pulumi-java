// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ByteMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetState Empty = new ByteMatchSetState();

    /**
     * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * 
     */
    @Import(name="byteMatchTuples")
      private final @Nullable Output<List<ByteMatchSetByteMatchTupleGetArgs>> byteMatchTuples;

    public Output<List<ByteMatchSetByteMatchTupleGetArgs>> byteMatchTuples() {
        return this.byteMatchTuples == null ? Codegen.empty() : this.byteMatchTuples;
    }

    /**
     * The name or description of the ByteMatchSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ByteMatchSetState(
        @Nullable Output<List<ByteMatchSetByteMatchTupleGetArgs>> byteMatchTuples,
        @Nullable Output<String> name) {
        this.byteMatchTuples = byteMatchTuples;
        this.name = name;
    }

    private ByteMatchSetState() {
        this.byteMatchTuples = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ByteMatchSetByteMatchTupleGetArgs>> byteMatchTuples;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchTuples = defaults.byteMatchTuples;
    	      this.name = defaults.name;
        }

        public Builder byteMatchTuples(@Nullable Output<List<ByteMatchSetByteMatchTupleGetArgs>> byteMatchTuples) {
            this.byteMatchTuples = byteMatchTuples;
            return this;
        }
        public Builder byteMatchTuples(@Nullable List<ByteMatchSetByteMatchTupleGetArgs> byteMatchTuples) {
            this.byteMatchTuples = Codegen.ofNullable(byteMatchTuples);
            return this;
        }
        public Builder byteMatchTuples(ByteMatchSetByteMatchTupleGetArgs... byteMatchTuples) {
            return byteMatchTuples(List.of(byteMatchTuples));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ByteMatchSetState build() {
            return new ByteMatchSetState(byteMatchTuples, name);
        }
    }
}
