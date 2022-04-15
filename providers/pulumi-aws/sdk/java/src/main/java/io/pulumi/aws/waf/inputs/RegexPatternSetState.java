// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexPatternSetState extends io.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetState Empty = new RegexPatternSetState();

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name or description of the Regex Pattern Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
     * 
     */
    @Import(name="regexPatternStrings")
      private final @Nullable Output<List<String>> regexPatternStrings;

    public Output<List<String>> regexPatternStrings() {
        return this.regexPatternStrings == null ? Codegen.empty() : this.regexPatternStrings;
    }

    public RegexPatternSetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> regexPatternStrings) {
        this.arn = arn;
        this.name = name;
        this.regexPatternStrings = regexPatternStrings;
    }

    private RegexPatternSetState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.regexPatternStrings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> regexPatternStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.regexPatternStrings = defaults.regexPatternStrings;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
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
        public Builder regexPatternStrings(@Nullable Output<List<String>> regexPatternStrings) {
            this.regexPatternStrings = regexPatternStrings;
            return this;
        }
        public Builder regexPatternStrings(@Nullable List<String> regexPatternStrings) {
            this.regexPatternStrings = Codegen.ofNullable(regexPatternStrings);
            return this;
        }
        public Builder regexPatternStrings(String... regexPatternStrings) {
            return regexPatternStrings(List.of(regexPatternStrings));
        }        public RegexPatternSetState build() {
            return new RegexPatternSetState(arn, name, regexPatternStrings);
        }
    }
}
