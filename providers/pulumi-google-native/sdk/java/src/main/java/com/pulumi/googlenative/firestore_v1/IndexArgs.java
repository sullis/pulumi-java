// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firestore_v1.enums.IndexQueryScope;
import com.pulumi.googlenative.firestore_v1.inputs.GoogleFirestoreAdminV1IndexFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexArgs Empty = new IndexArgs();

    @Import(name="collectionGroupId", required=true)
    private Output<String> collectionGroupId;

    public Output<String> collectionGroupId() {
        return this.collectionGroupId;
    }

    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    public Output<String> databaseId() {
        return this.databaseId;
    }

    /**
     * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    @Import(name="fields")
    private @Nullable Output<List<GoogleFirestoreAdminV1IndexFieldArgs>> fields;

    /**
     * @return The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    public Optional<Output<List<GoogleFirestoreAdminV1IndexFieldArgs>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    @Import(name="queryScope")
    private @Nullable Output<IndexQueryScope> queryScope;

    /**
     * @return Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    public Optional<Output<IndexQueryScope>> queryScope() {
        return Optional.ofNullable(this.queryScope);
    }

    private IndexArgs() {}

    private IndexArgs(IndexArgs $) {
        this.collectionGroupId = $.collectionGroupId;
        this.databaseId = $.databaseId;
        this.fields = $.fields;
        this.project = $.project;
        this.queryScope = $.queryScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexArgs $;

        public Builder() {
            $ = new IndexArgs();
        }

        public Builder(IndexArgs defaults) {
            $ = new IndexArgs(Objects.requireNonNull(defaults));
        }

        public Builder collectionGroupId(Output<String> collectionGroupId) {
            $.collectionGroupId = collectionGroupId;
            return this;
        }

        public Builder collectionGroupId(String collectionGroupId) {
            return collectionGroupId(Output.of(collectionGroupId));
        }

        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param fields The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable Output<List<GoogleFirestoreAdminV1IndexFieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<GoogleFirestoreAdminV1IndexFieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
         * 
         * @return builder
         * 
         */
        public Builder fields(GoogleFirestoreAdminV1IndexFieldArgs... fields) {
            return fields(List.of(fields));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param queryScope Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
         * 
         * @return builder
         * 
         */
        public Builder queryScope(@Nullable Output<IndexQueryScope> queryScope) {
            $.queryScope = queryScope;
            return this;
        }

        /**
         * @param queryScope Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
         * 
         * @return builder
         * 
         */
        public Builder queryScope(IndexQueryScope queryScope) {
            return queryScope(Output.of(queryScope));
        }

        public IndexArgs build() {
            $.collectionGroupId = Objects.requireNonNull($.collectionGroupId, "expected parameter 'collectionGroupId' to be non-null");
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            return $;
        }
    }

}
