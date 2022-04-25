// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AttackComplexity;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AttackVector;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AvailabilityImpact;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3ConfidentialityImpact;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3IntegrityImpact;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3PrivilegesRequired;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3Scope;
import com.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3UserInteraction;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common Vulnerability Scoring System version 3. For details, see https://www.first.org/cvss/specification-document
 * 
 */
public final class CVSSv3Args extends com.pulumi.resources.ResourceArgs {

    public static final CVSSv3Args Empty = new CVSSv3Args();

    @Import(name="attackComplexity")
    private @Nullable Output<CVSSv3AttackComplexity> attackComplexity;

    public Optional<Output<CVSSv3AttackComplexity>> attackComplexity() {
        return Optional.ofNullable(this.attackComplexity);
    }

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @Import(name="attackVector")
    private @Nullable Output<CVSSv3AttackVector> attackVector;

    /**
     * @return Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    public Optional<Output<CVSSv3AttackVector>> attackVector() {
        return Optional.ofNullable(this.attackVector);
    }

    @Import(name="availabilityImpact")
    private @Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact;

    public Optional<Output<CVSSv3AvailabilityImpact>> availabilityImpact() {
        return Optional.ofNullable(this.availabilityImpact);
    }

    /**
     * The base score is a function of the base metric scores.
     * 
     */
    @Import(name="baseScore")
    private @Nullable Output<Double> baseScore;

    /**
     * @return The base score is a function of the base metric scores.
     * 
     */
    public Optional<Output<Double>> baseScore() {
        return Optional.ofNullable(this.baseScore);
    }

    @Import(name="confidentialityImpact")
    private @Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact;

    public Optional<Output<CVSSv3ConfidentialityImpact>> confidentialityImpact() {
        return Optional.ofNullable(this.confidentialityImpact);
    }

    @Import(name="exploitabilityScore")
    private @Nullable Output<Double> exploitabilityScore;

    public Optional<Output<Double>> exploitabilityScore() {
        return Optional.ofNullable(this.exploitabilityScore);
    }

    @Import(name="impactScore")
    private @Nullable Output<Double> impactScore;

    public Optional<Output<Double>> impactScore() {
        return Optional.ofNullable(this.impactScore);
    }

    @Import(name="integrityImpact")
    private @Nullable Output<CVSSv3IntegrityImpact> integrityImpact;

    public Optional<Output<CVSSv3IntegrityImpact>> integrityImpact() {
        return Optional.ofNullable(this.integrityImpact);
    }

    @Import(name="privilegesRequired")
    private @Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired;

    public Optional<Output<CVSSv3PrivilegesRequired>> privilegesRequired() {
        return Optional.ofNullable(this.privilegesRequired);
    }

    @Import(name="scope")
    private @Nullable Output<CVSSv3Scope> scope;

    public Optional<Output<CVSSv3Scope>> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="userInteraction")
    private @Nullable Output<CVSSv3UserInteraction> userInteraction;

    public Optional<Output<CVSSv3UserInteraction>> userInteraction() {
        return Optional.ofNullable(this.userInteraction);
    }

    private CVSSv3Args() {}

    private CVSSv3Args(CVSSv3Args $) {
        this.attackComplexity = $.attackComplexity;
        this.attackVector = $.attackVector;
        this.availabilityImpact = $.availabilityImpact;
        this.baseScore = $.baseScore;
        this.confidentialityImpact = $.confidentialityImpact;
        this.exploitabilityScore = $.exploitabilityScore;
        this.impactScore = $.impactScore;
        this.integrityImpact = $.integrityImpact;
        this.privilegesRequired = $.privilegesRequired;
        this.scope = $.scope;
        this.userInteraction = $.userInteraction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CVSSv3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CVSSv3Args $;

        public Builder() {
            $ = new CVSSv3Args();
        }

        public Builder(CVSSv3Args defaults) {
            $ = new CVSSv3Args(Objects.requireNonNull(defaults));
        }

        public Builder attackComplexity(@Nullable Output<CVSSv3AttackComplexity> attackComplexity) {
            $.attackComplexity = attackComplexity;
            return this;
        }

        public Builder attackComplexity(CVSSv3AttackComplexity attackComplexity) {
            return attackComplexity(Output.of(attackComplexity));
        }

        /**
         * @param attackVector Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
         * 
         * @return builder
         * 
         */
        public Builder attackVector(@Nullable Output<CVSSv3AttackVector> attackVector) {
            $.attackVector = attackVector;
            return this;
        }

        /**
         * @param attackVector Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
         * 
         * @return builder
         * 
         */
        public Builder attackVector(CVSSv3AttackVector attackVector) {
            return attackVector(Output.of(attackVector));
        }

        public Builder availabilityImpact(@Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact) {
            $.availabilityImpact = availabilityImpact;
            return this;
        }

        public Builder availabilityImpact(CVSSv3AvailabilityImpact availabilityImpact) {
            return availabilityImpact(Output.of(availabilityImpact));
        }

        /**
         * @param baseScore The base score is a function of the base metric scores.
         * 
         * @return builder
         * 
         */
        public Builder baseScore(@Nullable Output<Double> baseScore) {
            $.baseScore = baseScore;
            return this;
        }

        /**
         * @param baseScore The base score is a function of the base metric scores.
         * 
         * @return builder
         * 
         */
        public Builder baseScore(Double baseScore) {
            return baseScore(Output.of(baseScore));
        }

        public Builder confidentialityImpact(@Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact) {
            $.confidentialityImpact = confidentialityImpact;
            return this;
        }

        public Builder confidentialityImpact(CVSSv3ConfidentialityImpact confidentialityImpact) {
            return confidentialityImpact(Output.of(confidentialityImpact));
        }

        public Builder exploitabilityScore(@Nullable Output<Double> exploitabilityScore) {
            $.exploitabilityScore = exploitabilityScore;
            return this;
        }

        public Builder exploitabilityScore(Double exploitabilityScore) {
            return exploitabilityScore(Output.of(exploitabilityScore));
        }

        public Builder impactScore(@Nullable Output<Double> impactScore) {
            $.impactScore = impactScore;
            return this;
        }

        public Builder impactScore(Double impactScore) {
            return impactScore(Output.of(impactScore));
        }

        public Builder integrityImpact(@Nullable Output<CVSSv3IntegrityImpact> integrityImpact) {
            $.integrityImpact = integrityImpact;
            return this;
        }

        public Builder integrityImpact(CVSSv3IntegrityImpact integrityImpact) {
            return integrityImpact(Output.of(integrityImpact));
        }

        public Builder privilegesRequired(@Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired) {
            $.privilegesRequired = privilegesRequired;
            return this;
        }

        public Builder privilegesRequired(CVSSv3PrivilegesRequired privilegesRequired) {
            return privilegesRequired(Output.of(privilegesRequired));
        }

        public Builder scope(@Nullable Output<CVSSv3Scope> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(CVSSv3Scope scope) {
            return scope(Output.of(scope));
        }

        public Builder userInteraction(@Nullable Output<CVSSv3UserInteraction> userInteraction) {
            $.userInteraction = userInteraction;
            return this;
        }

        public Builder userInteraction(CVSSv3UserInteraction userInteraction) {
            return userInteraction(Output.of(userInteraction));
        }

        public CVSSv3Args build() {
            return $;
        }
    }

}
