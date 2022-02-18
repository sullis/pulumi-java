// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyTestingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyTestingOptionsArgs Empty = new EnterpriseKeyTestingOptionsArgs();

    /**
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    @InputImport(name="testingChallenge")
    private final @Nullable Input<String> testingChallenge;

    public Input<String> getTestingChallenge() {
        return this.testingChallenge == null ? Input.empty() : this.testingChallenge;
    }

    /**
     * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    @InputImport(name="testingScore")
    private final @Nullable Input<Double> testingScore;

    public Input<Double> getTestingScore() {
        return this.testingScore == null ? Input.empty() : this.testingScore;
    }

    public EnterpriseKeyTestingOptionsArgs(
        @Nullable Input<String> testingChallenge,
        @Nullable Input<Double> testingScore) {
        this.testingChallenge = testingChallenge;
        this.testingScore = testingScore;
    }

    private EnterpriseKeyTestingOptionsArgs() {
        this.testingChallenge = Input.empty();
        this.testingScore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyTestingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> testingChallenge;
        private @Nullable Input<Double> testingScore;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyTestingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testingChallenge = defaults.testingChallenge;
    	      this.testingScore = defaults.testingScore;
        }

        public Builder setTestingChallenge(@Nullable Input<String> testingChallenge) {
            this.testingChallenge = testingChallenge;
            return this;
        }

        public Builder setTestingChallenge(@Nullable String testingChallenge) {
            this.testingChallenge = Input.ofNullable(testingChallenge);
            return this;
        }

        public Builder setTestingScore(@Nullable Input<Double> testingScore) {
            this.testingScore = testingScore;
            return this;
        }

        public Builder setTestingScore(@Nullable Double testingScore) {
            this.testingScore = Input.ofNullable(testingScore);
            return this;
        }

        public EnterpriseKeyTestingOptionsArgs build() {
            return new EnterpriseKeyTestingOptionsArgs(testingChallenge, testingScore);
        }
    }
}
