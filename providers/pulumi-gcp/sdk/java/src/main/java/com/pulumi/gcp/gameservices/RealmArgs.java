// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RealmArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealmArgs Empty = new RealmArgs();

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
    @Import(name="realmId", required=true)
    private Output<String> realmId;

    /**
     * @return GCP region of the Realm.
     * 
     */
    public Output<String> realmId() {
        return this.realmId;
    }

    /**
     * Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return Required. Time zone where all realm-specific policies are evaluated. The value of
     * this field must be from the IANA time zone database:
     * https://www.iana.org/time-zones.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private RealmArgs() {}

    private RealmArgs(RealmArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.realmId = $.realmId;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealmArgs $;

        public Builder() {
            $ = new RealmArgs();
        }

        public Builder(RealmArgs defaults) {
            $ = new RealmArgs(Objects.requireNonNull(defaults));
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
        public Builder realmId(Output<String> realmId) {
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
        public Builder timeZone(Output<String> timeZone) {
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

        public RealmArgs build() {
            $.realmId = Objects.requireNonNull($.realmId, "expected parameter 'realmId' to be non-null");
            $.timeZone = Objects.requireNonNull($.timeZone, "expected parameter 'timeZone' to be non-null");
            return $;
        }
    }

}
