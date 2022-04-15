// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.workspaces.outputs;

import io.pulumi.awsnative.workspaces.enums.ConnectionAliasState;
import io.pulumi.awsnative.workspaces.outputs.ConnectionAliasAssociation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionAliasResult {
    private final @Nullable String aliasId;
    private final @Nullable List<ConnectionAliasAssociation> associations;
    private final @Nullable ConnectionAliasState connectionAliasState;

    @CustomType.Constructor
    private GetConnectionAliasResult(
        @CustomType.Parameter("aliasId") @Nullable String aliasId,
        @CustomType.Parameter("associations") @Nullable List<ConnectionAliasAssociation> associations,
        @CustomType.Parameter("connectionAliasState") @Nullable ConnectionAliasState connectionAliasState) {
        this.aliasId = aliasId;
        this.associations = associations;
        this.connectionAliasState = connectionAliasState;
    }

    public Optional<String> aliasId() {
        return Optional.ofNullable(this.aliasId);
    }
    public List<ConnectionAliasAssociation> associations() {
        return this.associations == null ? List.of() : this.associations;
    }
    public Optional<ConnectionAliasState> connectionAliasState() {
        return Optional.ofNullable(this.connectionAliasState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aliasId;
        private @Nullable List<ConnectionAliasAssociation> associations;
        private @Nullable ConnectionAliasState connectionAliasState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasId = defaults.aliasId;
    	      this.associations = defaults.associations;
    	      this.connectionAliasState = defaults.connectionAliasState;
        }

        public Builder aliasId(@Nullable String aliasId) {
            this.aliasId = aliasId;
            return this;
        }
        public Builder associations(@Nullable List<ConnectionAliasAssociation> associations) {
            this.associations = associations;
            return this;
        }
        public Builder associations(ConnectionAliasAssociation... associations) {
            return associations(List.of(associations));
        }
        public Builder connectionAliasState(@Nullable ConnectionAliasState connectionAliasState) {
            this.connectionAliasState = connectionAliasState;
            return this;
        }        public GetConnectionAliasResult build() {
            return new GetConnectionAliasResult(aliasId, associations, connectionAliasState);
        }
    }
}
