// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.lambda.inputs.CodeSigningConfigAllowedPublishersArgs;
import io.pulumi.awsnative.lambda.inputs.CodeSigningConfigCodeSigningPoliciesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeSigningConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeSigningConfigArgs Empty = new CodeSigningConfigArgs();

    @InputImport(name="allowedPublishers", required=true)
    private final Input<CodeSigningConfigAllowedPublishersArgs> allowedPublishers;

    public Input<CodeSigningConfigAllowedPublishersArgs> getAllowedPublishers() {
        return this.allowedPublishers;
    }

    @InputImport(name="codeSigningPolicies")
    private final @Nullable Input<CodeSigningConfigCodeSigningPoliciesArgs> codeSigningPolicies;

    public Input<CodeSigningConfigCodeSigningPoliciesArgs> getCodeSigningPolicies() {
        return this.codeSigningPolicies == null ? Input.empty() : this.codeSigningPolicies;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public CodeSigningConfigArgs(
        Input<CodeSigningConfigAllowedPublishersArgs> allowedPublishers,
        @Nullable Input<CodeSigningConfigCodeSigningPoliciesArgs> codeSigningPolicies,
        @Nullable Input<String> description) {
        this.allowedPublishers = Objects.requireNonNull(allowedPublishers, "expected parameter 'allowedPublishers' to be non-null");
        this.codeSigningPolicies = codeSigningPolicies;
        this.description = description;
    }

    private CodeSigningConfigArgs() {
        this.allowedPublishers = Input.empty();
        this.codeSigningPolicies = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CodeSigningConfigAllowedPublishersArgs> allowedPublishers;
        private @Nullable Input<CodeSigningConfigCodeSigningPoliciesArgs> codeSigningPolicies;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPublishers = defaults.allowedPublishers;
    	      this.codeSigningPolicies = defaults.codeSigningPolicies;
    	      this.description = defaults.description;
        }

        public Builder setAllowedPublishers(Input<CodeSigningConfigAllowedPublishersArgs> allowedPublishers) {
            this.allowedPublishers = Objects.requireNonNull(allowedPublishers);
            return this;
        }

        public Builder setAllowedPublishers(CodeSigningConfigAllowedPublishersArgs allowedPublishers) {
            this.allowedPublishers = Input.of(Objects.requireNonNull(allowedPublishers));
            return this;
        }

        public Builder setCodeSigningPolicies(@Nullable Input<CodeSigningConfigCodeSigningPoliciesArgs> codeSigningPolicies) {
            this.codeSigningPolicies = codeSigningPolicies;
            return this;
        }

        public Builder setCodeSigningPolicies(@Nullable CodeSigningConfigCodeSigningPoliciesArgs codeSigningPolicies) {
            this.codeSigningPolicies = Input.ofNullable(codeSigningPolicies);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public CodeSigningConfigArgs build() {
            return new CodeSigningConfigArgs(allowedPublishers, codeSigningPolicies, description);
        }
    }
}
