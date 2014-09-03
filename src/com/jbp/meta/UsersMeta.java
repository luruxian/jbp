package com.jbp.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-09-03 21:39:30")
/** */
public final class UsersMeta extends org.slim3.datastore.ModelMeta<com.jbp.model.Users> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> country = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "country", "country");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, com.google.appengine.api.datastore.Key> userId = new org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, com.google.appengine.api.datastore.Key>(this, "__key__", "userId", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> userName = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "userName", "userName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UsersMeta slim3_singleton = new UsersMeta();

    /**
     * @return the singleton
     */
    public static UsersMeta get() {
       return slim3_singleton;
    }

    /** */
    public UsersMeta() {
        super("Users", com.jbp.model.Users.class);
    }

    @Override
    public com.jbp.model.Users entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.jbp.model.Users model = new com.jbp.model.Users();
        model.setCountry((java.lang.String) entity.getProperty("country"));
        model.setUserId(entity.getKey());
        model.setUserName((java.lang.String) entity.getProperty("userName"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getUserId() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getUserId());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("country", m.getCountry());
        entity.setProperty("userName", m.getUserName());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        return m.getUserId();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        m.setUserId(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCountry() != null){
            writer.setNextPropertyName("country");
            encoder0.encode(writer, m.getCountry());
        }
        if(m.getUserId() != null){
            writer.setNextPropertyName("userId");
            encoder0.encode(writer, m.getUserId());
        }
        if(m.getUserName() != null){
            writer.setNextPropertyName("userName");
            encoder0.encode(writer, m.getUserName());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.jbp.model.Users jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.jbp.model.Users m = new com.jbp.model.Users();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("country");
        m.setCountry(decoder0.decode(reader, m.getCountry()));
        reader = rootReader.newObjectReader("userId");
        m.setUserId(decoder0.decode(reader, m.getUserId()));
        reader = rootReader.newObjectReader("userName");
        m.setUserName(decoder0.decode(reader, m.getUserName()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}