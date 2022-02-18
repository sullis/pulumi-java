// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactGcsArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArtifactArgs Empty = new GuestPoliciesRecipeArtifactArgs();

    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type:
     * Remote: A checksum must be specified, and only protocols with transport-layer security are permitted.
     * GCS: An object generation number must be specified.
     * 
     */
    @InputImport(name="allowInsecure")
    private final @Nullable Input<Boolean> allowInsecure;

    public Input<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Input.empty() : this.allowInsecure;
    }

    /**
     * A Google Cloud Storage artifact.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gcs")
    private final @Nullable Input<GuestPoliciesRecipeArtifactGcsArgs> gcs;

    public Input<GuestPoliciesRecipeArtifactGcsArgs> getGcs() {
        return this.gcs == null ? Input.empty() : this.gcs;
    }

    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * A generic remote artifact.
     * Structure is documented below.
     * 
     */
    @InputImport(name="remote")
    private final @Nullable Input<GuestPoliciesRecipeArtifactRemoteArgs> remote;

    public Input<GuestPoliciesRecipeArtifactRemoteArgs> getRemote() {
        return this.remote == null ? Input.empty() : this.remote;
    }

    public GuestPoliciesRecipeArtifactArgs(
        @Nullable Input<Boolean> allowInsecure,
        @Nullable Input<GuestPoliciesRecipeArtifactGcsArgs> gcs,
        Input<String> id,
        @Nullable Input<GuestPoliciesRecipeArtifactRemoteArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.remote = remote;
    }

    private GuestPoliciesRecipeArtifactArgs() {
        this.allowInsecure = Input.empty();
        this.gcs = Input.empty();
        this.id = Input.empty();
        this.remote = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInsecure;
        private @Nullable Input<GuestPoliciesRecipeArtifactGcsArgs> gcs;
        private Input<String> id;
        private @Nullable Input<GuestPoliciesRecipeArtifactRemoteArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.id = defaults.id;
    	      this.remote = defaults.remote;
        }

        public Builder setAllowInsecure(@Nullable Input<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder setAllowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Input.ofNullable(allowInsecure);
            return this;
        }

        public Builder setGcs(@Nullable Input<GuestPoliciesRecipeArtifactGcsArgs> gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder setGcs(@Nullable GuestPoliciesRecipeArtifactGcsArgs gcs) {
            this.gcs = Input.ofNullable(gcs);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setRemote(@Nullable Input<GuestPoliciesRecipeArtifactRemoteArgs> remote) {
            this.remote = remote;
            return this;
        }

        public Builder setRemote(@Nullable GuestPoliciesRecipeArtifactRemoteArgs remote) {
            this.remote = Input.ofNullable(remote);
            return this;
        }

        public GuestPoliciesRecipeArtifactArgs build() {
            return new GuestPoliciesRecipeArtifactArgs(allowInsecure, gcs, id, remote);
        }
    }
}
