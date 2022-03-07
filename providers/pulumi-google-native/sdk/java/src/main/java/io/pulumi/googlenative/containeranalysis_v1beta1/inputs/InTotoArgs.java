// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ArtifactRuleArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.SigningKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This contains the fields corresponding to the definition of a software supply chain step in an in-toto layout. This information goes into a Grafeas note.
 * 
 */
public final class InTotoArgs extends io.pulumi.resources.ResourceArgs {

    public static final InTotoArgs Empty = new InTotoArgs();

    /**
     * This field contains the expected command used to perform the step.
     * 
     */
    @InputImport(name="expectedCommand")
      private final @Nullable Input<List<String>> expectedCommand;

    public Input<List<String>> getExpectedCommand() {
        return this.expectedCommand == null ? Input.empty() : this.expectedCommand;
    }

    /**
     * The following fields contain in-toto artifact rules identifying the artifacts that enter this supply chain step, and exit the supply chain step, i.e. materials and products of the step.
     * 
     */
    @InputImport(name="expectedMaterials")
      private final @Nullable Input<List<ArtifactRuleArgs>> expectedMaterials;

    public Input<List<ArtifactRuleArgs>> getExpectedMaterials() {
        return this.expectedMaterials == null ? Input.empty() : this.expectedMaterials;
    }

    @InputImport(name="expectedProducts")
      private final @Nullable Input<List<ArtifactRuleArgs>> expectedProducts;

    public Input<List<ArtifactRuleArgs>> getExpectedProducts() {
        return this.expectedProducts == null ? Input.empty() : this.expectedProducts;
    }

    /**
     * This field contains the public keys that can be used to verify the signatures on the step metadata.
     * 
     */
    @InputImport(name="signingKeys")
      private final @Nullable Input<List<SigningKeyArgs>> signingKeys;

    public Input<List<SigningKeyArgs>> getSigningKeys() {
        return this.signingKeys == null ? Input.empty() : this.signingKeys;
    }

    /**
     * This field identifies the name of the step in the supply chain.
     * 
     */
    @InputImport(name="stepName")
      private final @Nullable Input<String> stepName;

    public Input<String> getStepName() {
        return this.stepName == null ? Input.empty() : this.stepName;
    }

    /**
     * This field contains a value that indicates the minimum number of keys that need to be used to sign the step's in-toto link.
     * 
     */
    @InputImport(name="threshold")
      private final @Nullable Input<String> threshold;

    public Input<String> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public InTotoArgs(
        @Nullable Input<List<String>> expectedCommand,
        @Nullable Input<List<ArtifactRuleArgs>> expectedMaterials,
        @Nullable Input<List<ArtifactRuleArgs>> expectedProducts,
        @Nullable Input<List<SigningKeyArgs>> signingKeys,
        @Nullable Input<String> stepName,
        @Nullable Input<String> threshold) {
        this.expectedCommand = expectedCommand;
        this.expectedMaterials = expectedMaterials;
        this.expectedProducts = expectedProducts;
        this.signingKeys = signingKeys;
        this.stepName = stepName;
        this.threshold = threshold;
    }

    private InTotoArgs() {
        this.expectedCommand = Input.empty();
        this.expectedMaterials = Input.empty();
        this.expectedProducts = Input.empty();
        this.signingKeys = Input.empty();
        this.stepName = Input.empty();
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InTotoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> expectedCommand;
        private @Nullable Input<List<ArtifactRuleArgs>> expectedMaterials;
        private @Nullable Input<List<ArtifactRuleArgs>> expectedProducts;
        private @Nullable Input<List<SigningKeyArgs>> signingKeys;
        private @Nullable Input<String> stepName;
        private @Nullable Input<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(InTotoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedCommand = defaults.expectedCommand;
    	      this.expectedMaterials = defaults.expectedMaterials;
    	      this.expectedProducts = defaults.expectedProducts;
    	      this.signingKeys = defaults.signingKeys;
    	      this.stepName = defaults.stepName;
    	      this.threshold = defaults.threshold;
        }

        public Builder setExpectedCommand(@Nullable Input<List<String>> expectedCommand) {
            this.expectedCommand = expectedCommand;
            return this;
        }

        public Builder setExpectedCommand(@Nullable List<String> expectedCommand) {
            this.expectedCommand = Input.ofNullable(expectedCommand);
            return this;
        }

        public Builder setExpectedMaterials(@Nullable Input<List<ArtifactRuleArgs>> expectedMaterials) {
            this.expectedMaterials = expectedMaterials;
            return this;
        }

        public Builder setExpectedMaterials(@Nullable List<ArtifactRuleArgs> expectedMaterials) {
            this.expectedMaterials = Input.ofNullable(expectedMaterials);
            return this;
        }

        public Builder setExpectedProducts(@Nullable Input<List<ArtifactRuleArgs>> expectedProducts) {
            this.expectedProducts = expectedProducts;
            return this;
        }

        public Builder setExpectedProducts(@Nullable List<ArtifactRuleArgs> expectedProducts) {
            this.expectedProducts = Input.ofNullable(expectedProducts);
            return this;
        }

        public Builder setSigningKeys(@Nullable Input<List<SigningKeyArgs>> signingKeys) {
            this.signingKeys = signingKeys;
            return this;
        }

        public Builder setSigningKeys(@Nullable List<SigningKeyArgs> signingKeys) {
            this.signingKeys = Input.ofNullable(signingKeys);
            return this;
        }

        public Builder setStepName(@Nullable Input<String> stepName) {
            this.stepName = stepName;
            return this;
        }

        public Builder setStepName(@Nullable String stepName) {
            this.stepName = Input.ofNullable(stepName);
            return this;
        }

        public Builder setThreshold(@Nullable Input<String> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable String threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }
        public InTotoArgs build() {
            return new InTotoArgs(expectedCommand, expectedMaterials, expectedProducts, signingKeys, stepName, threshold);
        }
    }
}