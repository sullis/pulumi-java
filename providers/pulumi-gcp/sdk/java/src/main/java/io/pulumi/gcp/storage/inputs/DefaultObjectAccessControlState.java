// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.DefaultObjectAccessControlProjectTeamGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectAccessControlState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectAccessControlState Empty = new DefaultObjectAccessControlState();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * The domain associated with the entity.
     * 
     */
    @InputImport(name="domain")
    private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * The email address associated with the entity.
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * * user-{{userId}}
     * * user-{{email}} (such as "user-liz@example.com")
     * * group-{{groupId}}
     * * group-{{email}} (such as "group-example@googlegroups.com")
     * * domain-{{domain}} (such as "domain-example.com")
     * * project-team-{{projectId}}
     * * allUsers
     * * allAuthenticatedUsers
     * 
     */
    @InputImport(name="entity")
    private final @Nullable Input<String> entity;

    public Input<String> getEntity() {
        return this.entity == null ? Input.empty() : this.entity;
    }

    /**
     * The ID for the entity
     * 
     */
    @InputImport(name="entityId")
    private final @Nullable Input<String> entityId;

    public Input<String> getEntityId() {
        return this.entityId == null ? Input.empty() : this.entityId;
    }

    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @InputImport(name="generation")
    private final @Nullable Input<Integer> generation;

    public Input<Integer> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @InputImport(name="object")
    private final @Nullable Input<String> object;

    public Input<String> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    /**
     * The project team associated with the entity
     * 
     */
    @InputImport(name="projectTeams")
    private final @Nullable Input<List<DefaultObjectAccessControlProjectTeamGetArgs>> projectTeams;

    public Input<List<DefaultObjectAccessControlProjectTeamGetArgs>> getProjectTeams() {
        return this.projectTeams == null ? Input.empty() : this.projectTeams;
    }

    /**
     * The access permission for the entity.
     * Possible values are `OWNER` and `READER`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public DefaultObjectAccessControlState(
        @Nullable Input<String> bucket,
        @Nullable Input<String> domain,
        @Nullable Input<String> email,
        @Nullable Input<String> entity,
        @Nullable Input<String> entityId,
        @Nullable Input<Integer> generation,
        @Nullable Input<String> object,
        @Nullable Input<List<DefaultObjectAccessControlProjectTeamGetArgs>> projectTeams,
        @Nullable Input<String> role) {
        this.bucket = bucket;
        this.domain = domain;
        this.email = email;
        this.entity = entity;
        this.entityId = entityId;
        this.generation = generation;
        this.object = object;
        this.projectTeams = projectTeams;
        this.role = role;
    }

    private DefaultObjectAccessControlState() {
        this.bucket = Input.empty();
        this.domain = Input.empty();
        this.email = Input.empty();
        this.entity = Input.empty();
        this.entityId = Input.empty();
        this.generation = Input.empty();
        this.object = Input.empty();
        this.projectTeams = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectAccessControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<String> domain;
        private @Nullable Input<String> email;
        private @Nullable Input<String> entity;
        private @Nullable Input<String> entityId;
        private @Nullable Input<Integer> generation;
        private @Nullable Input<String> object;
        private @Nullable Input<List<DefaultObjectAccessControlProjectTeamGetArgs>> projectTeams;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectAccessControlState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
    	      this.projectTeams = defaults.projectTeams;
    	      this.role = defaults.role;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setEntity(@Nullable Input<String> entity) {
            this.entity = entity;
            return this;
        }

        public Builder setEntity(@Nullable String entity) {
            this.entity = Input.ofNullable(entity);
            return this;
        }

        public Builder setEntityId(@Nullable Input<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setEntityId(@Nullable String entityId) {
            this.entityId = Input.ofNullable(entityId);
            return this;
        }

        public Builder setGeneration(@Nullable Input<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder setGeneration(@Nullable Integer generation) {
            this.generation = Input.ofNullable(generation);
            return this;
        }

        public Builder setObject(@Nullable Input<String> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable String object) {
            this.object = Input.ofNullable(object);
            return this;
        }

        public Builder setProjectTeams(@Nullable Input<List<DefaultObjectAccessControlProjectTeamGetArgs>> projectTeams) {
            this.projectTeams = projectTeams;
            return this;
        }

        public Builder setProjectTeams(@Nullable List<DefaultObjectAccessControlProjectTeamGetArgs> projectTeams) {
            this.projectTeams = Input.ofNullable(projectTeams);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public DefaultObjectAccessControlState build() {
            return new DefaultObjectAccessControlState(bucket, domain, email, entity, entityId, generation, object, projectTeams, role);
        }
    }
}
