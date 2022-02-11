// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CodeSigningConfigAllowedPublishers extends io.pulumi.resources.InvokeArgs {

    public static final CodeSigningConfigAllowedPublishers Empty = new CodeSigningConfigAllowedPublishers();

    @InputImport(name="signingProfileVersionArns", required=true)
    private final List<String> signingProfileVersionArns;

    public List<String> getSigningProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public CodeSigningConfigAllowedPublishers(List<String> signingProfileVersionArns) {
        this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns, "expected parameter 'signingProfileVersionArns' to be non-null");
    }

    private CodeSigningConfigAllowedPublishers() {
        this.signingProfileVersionArns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigAllowedPublishers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigAllowedPublishers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder setSigningProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }

        public CodeSigningConfigAllowedPublishers build() {
            return new CodeSigningConfigAllowedPublishers(signingProfileVersionArns);
        }
    }
}
