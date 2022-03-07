// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.AttestationAuthorityHintResponse;
import java.util.Objects;


/**
 * Note kind that represents a logical attestation "role" or "authority". For example, an organization might have one `AttestationAuthority` for "QA" and one for "build". This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations). This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note. It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don't all live in the same project.
 * 
 */
public final class AttestationAuthorityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttestationAuthorityResponse Empty = new AttestationAuthorityResponse();

    @InputImport(name="hint", required=true)
      private final AttestationAuthorityHintResponse hint;

    public AttestationAuthorityHintResponse getHint() {
        return this.hint;
    }

    public AttestationAuthorityResponse(AttestationAuthorityHintResponse hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private AttestationAuthorityResponse() {
        this.hint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityHintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(AttestationAuthorityHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public AttestationAuthorityResponse build() {
            return new AttestationAuthorityResponse(hint);
        }
    }
}