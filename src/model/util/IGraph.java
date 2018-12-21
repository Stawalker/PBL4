/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

import java.util.Iterator;

/**
 *
 * @author weslei
 */
public interface IGraph {

        public void addVertex(Object key);

        public Iterator vertices();

        public int numVertices();

        public void removeVertex(Object key);

        public void addEdge(Object u, Object v, Object data);

        public Rota getEdge(Object u, Object v);

        public Iterator edges();

        public int numEdges();

        public void removeEdge(Rota e);

        public Iterator outgoingEdges(Object v);

        public int outDegree(Object v);

        public Iterator incomingEdges(Object v);

        public int inDegree(Object v);

}
