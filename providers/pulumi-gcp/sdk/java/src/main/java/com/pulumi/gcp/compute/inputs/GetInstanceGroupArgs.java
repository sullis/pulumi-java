// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupArgs Empty = new GetInstanceGroupArgs();

    /**
     * The name of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The self link of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    @Import(name="selfLink")
    private @Nullable String selfLink;

    /**
     * @return The self link of the instance group. Either `name` or `self_link` must be provided.
     * 
     */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The zone of the instance group. If referencing the instance group by name
     * and `zone` is not provided, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return The zone of the instance group. If referencing the instance group by name
     * and `zone` is not provided, the provider zone is used.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetInstanceGroupArgs() {}

    private GetInstanceGroupArgs(GetInstanceGroupArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceGroupArgs $;

        public Builder() {
            $ = new GetInstanceGroupArgs();
        }

        public Builder(GetInstanceGroupArgs defaults) {
            $ = new GetInstanceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the instance group. Either `name` or `self_link` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param selfLink The self link of the instance group. Either `name` or `self_link` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable String selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param zone The zone of the instance group. If referencing the instance group by name
         * and `zone` is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetInstanceGroupArgs build() {
            return $;
        }
    }

}
