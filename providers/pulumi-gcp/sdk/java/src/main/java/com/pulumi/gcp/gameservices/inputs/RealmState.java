// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RealmState extends com.pulumi.resources.ResourceArgs {

    public static final RealmState Empty = new RealmState();

    /**
     * Human readable description of the realm.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human readable description of the realm.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * ETag of the resource.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return ETag of the resource.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this realm. Each label is a key-value pair.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Location of the Realm.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the Realm.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource id of the realm, of the form: &#39;projects/{project_id}/locations/{location}/realms/{realm_id}&#39;. For example,
     * &#39;projects/my-project/locations/{location}/realms/my-realm&#39;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource id of the realm, of the form: &#39;projects/{project_id}/locations/{location}/realms/{realm_id}&#39;. For example,
     * &#39;projects/my-project/locations/{location}/realms/my-realm&#39;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * GCP region of the Realm.
     * 
     */
    @Import(name="realmId")
    private @Nullable Output<String> realmId;

    /**
     * @return GCP region of the Realm.
     * 
     */
    public Optional<Output<String>> realmId() {
        return Optional.ofNullable(this.realmId);
    }

    /**
     * Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private RealmState() {}

    private RealmState(RealmState $) {
        this.description = $.description;
        this.etag = $.etag;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.realmId = $.realmId;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealmState $;

        public Builder() {
            $ = new RealmState();
        }

        public Builder(RealmState defaults) {
            $ = new RealmState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Human readable description of the realm.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human readable description of the realm.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag ETag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag ETag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param labels The labels associated with this realm. Each label is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this realm. Each label is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Location of the Realm.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the Realm.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource id of the realm, of the form: &#39;projects/{project_id}/locations/{location}/realms/{realm_id}&#39;. For example,
         * &#39;projects/my-project/locations/{location}/realms/my-realm&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource id of the realm, of the form: &#39;projects/{project_id}/locations/{location}/realms/{realm_id}&#39;. For example,
         * &#39;projects/my-project/locations/{location}/realms/my-realm&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param realmId GCP region of the Realm.
         * 
         * @return builder
         * 
         */
        public Builder realmId(@Nullable Output<String> realmId) {
            $.realmId = realmId;
            return this;
        }

        /**
         * @param realmId GCP region of the Realm.
         * 
         * @return builder
         * 
         */
        public Builder realmId(String realmId) {
            return realmId(Output.of(realmId));
        }

        /**
         * @param timeZone Required. Time zone where all realm-specific policies are evaluated. The value of
         * this field must be from the IANA time zone database:
         * https://www.iana.org/time-zones.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Required. Time zone where all realm-specific policies are evaluated. The value of
         * this field must be from the IANA time zone database:
         * https://www.iana.org/time-zones.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public RealmState build() {
            return $;
        }
    }

}
