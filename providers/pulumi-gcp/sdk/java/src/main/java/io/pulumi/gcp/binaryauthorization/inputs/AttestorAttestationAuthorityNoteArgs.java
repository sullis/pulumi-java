// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorAttestationAuthorityNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorAttestationAuthorityNoteArgs Empty = new AttestorAttestationAuthorityNoteArgs();

    /**
     * - 
     * This field will contain the service account email address that
     * this Attestor will use as the principal when querying Container
     * Analysis. Attestor administrators must grant this service account
     * the IAM role needed to read attestations from the noteReference in
     * Container Analysis (containeranalysis.notes.occurrences.viewer).
     * This email address is fixed for the lifetime of the Attestor, but
     * callers should not make any other assumptions about the service
     * account email; future versions may use an email based on a
     * different naming pattern.
     * 
     */
    @Import(name="delegationServiceAccountEmail")
      private final @Nullable Output<String> delegationServiceAccountEmail;

    public Output<String> getDelegationServiceAccountEmail() {
        return this.delegationServiceAccountEmail == null ? Output.empty() : this.delegationServiceAccountEmail;
    }

    /**
     * The resource name of a ATTESTATION_AUTHORITY Note, created by the
     * user. If the Note is in a different project from the Attestor, it
     * should be specified in the format `projects/*{@literal /}notes/*` (or the legacy
     * `providers/*{@literal /}notes/*`). This field may not be updated.
     * An attestation by this attestor is stored as a Container Analysis
     * ATTESTATION_AUTHORITY Occurrence that names a container image
     * and that links to this Note.
     * 
     */
    @Import(name="noteReference", required=true)
      private final Output<String> noteReference;

    public Output<String> getNoteReference() {
        return this.noteReference;
    }

    /**
     * Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys;

    public Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> getPublicKeys() {
        return this.publicKeys == null ? Output.empty() : this.publicKeys;
    }

    public AttestorAttestationAuthorityNoteArgs(
        @Nullable Output<String> delegationServiceAccountEmail,
        Output<String> noteReference,
        @Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys) {
        this.delegationServiceAccountEmail = delegationServiceAccountEmail;
        this.noteReference = Objects.requireNonNull(noteReference, "expected parameter 'noteReference' to be non-null");
        this.publicKeys = publicKeys;
    }

    private AttestorAttestationAuthorityNoteArgs() {
        this.delegationServiceAccountEmail = Output.empty();
        this.noteReference = Output.empty();
        this.publicKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delegationServiceAccountEmail;
        private Output<String> noteReference;
        private @Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationServiceAccountEmail = defaults.delegationServiceAccountEmail;
    	      this.noteReference = defaults.noteReference;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder delegationServiceAccountEmail(@Nullable Output<String> delegationServiceAccountEmail) {
            this.delegationServiceAccountEmail = delegationServiceAccountEmail;
            return this;
        }
        public Builder delegationServiceAccountEmail(@Nullable String delegationServiceAccountEmail) {
            this.delegationServiceAccountEmail = Output.ofNullable(delegationServiceAccountEmail);
            return this;
        }
        public Builder noteReference(Output<String> noteReference) {
            this.noteReference = Objects.requireNonNull(noteReference);
            return this;
        }
        public Builder noteReference(String noteReference) {
            this.noteReference = Output.of(Objects.requireNonNull(noteReference));
            return this;
        }
        public Builder publicKeys(@Nullable Output<List<AttestorAttestationAuthorityNotePublicKeyArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(@Nullable List<AttestorAttestationAuthorityNotePublicKeyArgs> publicKeys) {
            this.publicKeys = Output.ofNullable(publicKeys);
            return this;
        }
        public Builder publicKeys(AttestorAttestationAuthorityNotePublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public AttestorAttestationAuthorityNoteArgs build() {
            return new AttestorAttestationAuthorityNoteArgs(delegationServiceAccountEmail, noteReference, publicKeys);
        }
    }
}
