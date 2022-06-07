// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKMSKeyRingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKMSKeyRingPlainArgs Empty = new GetKMSKeyRingPlainArgs();

    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The KeyRing&#39;s name.
     * A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The KeyRing&#39;s name.
     * A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetKMSKeyRingPlainArgs() {}

    private GetKMSKeyRingPlainArgs(GetKMSKeyRingPlainArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKMSKeyRingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKMSKeyRingPlainArgs $;

        public Builder() {
            $ = new GetKMSKeyRingPlainArgs();
        }

        public Builder(GetKMSKeyRingPlainArgs defaults) {
            $ = new GetKMSKeyRingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Google Cloud Platform location for the KeyRing.
         * A full list of valid locations can be found by running `gcloud kms locations list`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param name The KeyRing&#39;s name.
         * A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetKMSKeyRingPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
